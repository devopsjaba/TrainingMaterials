<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="loginId" value="${sessionScope.id }" />
<c:set var="loginout" value="${sessionScope.id==null ? 'Login' : 'id:'+=loginId }" />
<c:set var="loginoutlink" value="${sessionScope.id==null ? '/login/login' : '/login/logout' }" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value='/resources/css/menu.css' />"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css"  />
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
	* {
		box-sizing: border-box;
		margin: 0;
		padding: 0;
		font-family: "Noto Sans KR", sans-serif;	
	}
	
	.container {
		width: 50%;
		margin: auto;
	}
	
	. writing-header {
		position: relative;
		margin: 20px 0 0 0;
		padding-bottom: 10px;
		border-bottom: 1px solid #323232;
	}
	
	.frm {
		width: 100%;
	}
	
	input {
		width: 100%;
		height: 35px;
		margin: 5px 0px 10px 0px;
		border: 1px solid #f8f8f8;
		padding: 8px;
		background: #f8f8f8;
		outline-color: #e6e6e6;
	}
	
	textarea {
		width: 100%;
		background: #f8f8f8;
		margin: 5px 0px 10px 0px;
		border: 1px solid #e9e8e8;
		resize: none;
		padding: 8px;
		outline-color: #e6e6e6;
	}
	
	.btn {
		background-color: rgb(236, 236, 236);
		border: none;
		color: black;
		padding: 6px 12px;
		font-size: 16px;
		cursor: pointer;
		border-radius: 5px;
	}
	
	.btn:hover {
		text-decoration: underline;
    }
</style>
</head>
<body>
	<div id="menu">
		<ul>
			<li id="logo">kosta</li>
			<li><a href="<c:url value="/" />">Home</a></li>
			<li><a href="<c:url value="/board/list" />">Board</a></li>
			<li><a href="<c:url value="${loginoutlink}" />">${loginout}</a></li>
			<li><a href="<c:url value="/register/add" />">SignUp</a></li>
			<li><a href=""><i class="fa fa-search small"></i></a></li>
		</ul>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {					/* main() */
			//let bno = 1115
			let bno = $("input[name=bno]").val()
			
			$("#listBtn").on("click", function() {
				location.href = "<c:url value="/board/list${searchItem.queryString}" />"
			})
			
			$("#removeBtn").on("click", function() {
				if(!confirm("정말로 삭제하시겠습니까?")) return;
				let form = $("#form")
				form.attr("action", "<c:url value="/board/remove${searchItem.queryString}" />")
				form.attr("method", "post")
				form.submit()
			})
			
			$("#writeBtn").on("click", function() {
				let form = $("#form");
				form.attr("action", "<c:url value="/board/write" />")
				form.attr("method", "post")
				
				if(formCheck())
					form.submit()
			})
			
			let formCheck = function() {
				let form = document.getElementById("form")
				if(form.title.value == "") {
					alert("제목을 입력해 주세요.")
					form.title.focus()
					return false
				}
				
				if(form.content.value == "") {
					alert("내용을 입력해 주세요.")
					form.content.focus()
					return false
				}				
				return true
			}
			
			$("#modifyBtn").on("click", function() {
				let form = $("#form")
				let isReadOnly = $("input[name=title]").attr('readonly')
				
				//1. 읽기 상태이면 수정상태로 변경
				if(isReadOnly=='readonly') {
					$(".writing-header").html('게시판 수정')
					$("input[name=title]").attr('readonly', false)
					$("textarea").attr('readonly', false)
					$("#modifyBtn").html("<i class='fa fa-pencil-alt'></i>등록")
					return;
				}
				//2. 수정 상태이면 수정된 내용을 서버로 전송 
				form.attr("action", "<c:url value="/board/modify?page=${page}&pageSize=${pageSize}" />")
				form.attr("method", "post")
				if(formCheck())
					form.submit()				
			})
			

			$("#insertBtn").click(function() {			//댓글 추가하기
				let comment = $("input[name=comment]").val()
				
				if(comment.trim() == '') {
					alert("댓글을 입력해 주세요.")
					$("input[name=comment]").focus()
					return
				}
			
				$.ajax({
					type : 'post',					// 요청 메서드 
					url : '/october/comments?bno='+bno,			//요청 URI
					headers : { "content-type" : "application/json"}, 			//요청 헤더
					data : JSON.stringify({bno:bno, comment:comment}),		//서버로 전송할 데이터. stringify()로 직렬화 필요
					success : function(result) {											//서버로부터 응답이 도착하면 호출될 함수
						alert(result)
						showList(bno)
					},
					error : function() { alert("error")	}									//서버로부터 에러가 발생했을 때 호출될 함수
				})
					
			})			
			
			$("#commentList").on("click", ".delBtn", function() {		// commentList안에 있는 delBtn버튼에다가 클릭이벤트를 등록해야함 
				//alert("삭제 버튼 클릭함")
				let cno = $(this).parent().attr("data-cno")			//<li>태그는 <button>의 부모임
				let bno = $(this).parent().attr("data-bno")			//attr중 사용자 정의 attr를 선택함 
				
				$.ajax({
					type: 'DELETE',					// 요청 메서드
					url: '/october/comments/'+cno+'?bno='+bno,			// 요청 URI
					success : function(result) {									// 서버로부터 응답이 도착하면 호출될 함수
						alert(result)														// result - 서버가 전송한 데이터
						showList(bno)
					},
					error : function() {												// 에러가 발생했을 때 호출될 함수 
						alert("error")
					}
				})
			})				
			
			let showList = function(bno) {
				
				$.ajax({
					type: 'GET',			//요청 메서드
					url: '/october/comments?bno='+bno,				// 요청 URI
					success : function(result) {							// 서버로부터 응답이 도착하면 호출될 함수 
						$("#commentList").html(toHtml(result))					// result는 서버가 전송한 데이터 
					},
					error : function() { 										// 에러가 발생했을 때 호출될 함수 
						alert("error")	
					}
					
				})
				
			}
			
			let toHtml = function(comments) {
				let tmp = "<ul>"
				
				comments.forEach(function(comment) {
					tmp += '<li data-cno=' + comment.cno
					tmp += ' data-pcno=' + comment.pcno
					tmp += ' data-bno=' + comment.bno + '>'
					tmp += ' commenter=<span class="commenter">' +comment.commenter+ '</span>'
					tmp += ' comment=<span class="comment">' +comment.comment+ '</span>'
					tmp += ' <button class="delBtn">삭제</button>'
					tmp += '</li>'
				})
				
				return tmp + "</ul>"
			}
			
			showList(bno)
			
		})
	</script>
	
	<script type="text/javascript">
		let msg = "${msg}"
		if(msg == "WRT_ERR") alert("게시물 등록에 실패하였습니다. 다시 시도해 주세요.")
		if(msg == "MOD_ERR") alert("게시물 수정에 실패하였습니다. 다시 시도해 주세요.")
	</script>
	
	<div class="container">
		<h2 class="writing-header">게시판 ${mode=="new" ? "글쓰기" : "읽기" }</h2>
		<form action="" id="form" class="frm" method="post">
			<input type="hidden" name="bno" value="${boardDto.bno }" />
			<input type="text"  name="title" value="${boardDto.title }"  ${mode eq "new" ? "" : "readonly='readonly' "}/><br/>
			<textarea rows="20" cols="" name="content"  ${mode=="new" ? "" : "readonly='readonly' "}>
				${boardDto.content }
			</textarea><br/>
			
			<c:if test="${mode eq 'new' }">
				<button type="button" id="writeBtn" class="btn btn-write"><i class="fa fa-pencil-alt" aria-hidden="true"></i>등록</button>
			</c:if>
			<c:if test="${mode ne 'new' }">
				<button type="button" id="writeNewBtn" class="btn btn-write"><i class="fa fa-pencil-alt" aria-hidden="true"></i>글쓰기</button>
			</c:if>			
			<c:if test="${boardDto.writer eq loginId}">
				<button type="button" id="modifyBtn" class="btn btn-modify"><i class="fa fa-edit" aria-hidden="true"></i>수정</button>
				<button type="button" id="removeBtn" class="btn btn-remove"><i class="fa fa-trash" aria-hidden="true"></i>삭제</button>
			</c:if>			
			
			<button type="button" id="listBtn" class="btn btn-list"><i class="fa fa-bars" aria-hidden="true"></i>목록</button>
			
			<div id="commentList"></div>
			
			comment : <input type="text" name="comment" />
			<button id="insertBtn" type="button">댓글작성</button>			
		</form>
	</div>
</body>
</html>









