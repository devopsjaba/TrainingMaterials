<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
</head>
<body>
	<h2>CommentTest</h2>
	comment : <input type="text" name="comment" />
	<button id="sendBtn" type="button">SEND</button>
	<button id="modBtn" type="button">수정하기</button>
	<div id="commentList"></div>
	
	<script type="text/javascript">
		let bno = 1117
		
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
		
		$(document).ready(function() {
			showList(bno)
			
			$("#modBtn").click(function() {	 		//댓글 수정하기
				let cno = $(this).attr("data-cno")
				let comment = $("input[name=comment]").val()
				
				if(comment.trim() == '') {
					alert("댓글을 입력해 주세요.")
					$("input[name=comment]").focus()
					return
				}
			
				$.ajax({
					type : 'PATCH',					//요청 메서드
					url : '/october/comments/'+cno,			//요청 URI
					headers : { "content-type" : "application/json"}, 			//요청 헤더
					data : JSON.stringify({cno:cno, comment:comment}),		//서버로 전송할 데이터. stringify()로 직렬화 필요
					success : function(result) {											//서버로부터 응답이 도착하면 호출될 함수
						alert(result)
						showList(bno)
					},
					error : function() { alert("error")	}									//서버로부터 에러가 발생했을 때 호출될 함수					
				})
			
			})
			
			$("#sendBtn").click(function() {			//댓글 추가하기
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
			
			
			$("#commentList").on("click", ".modBtn", function() {    // commentList안에 있는 modBtn버튼에다가 클릭이벤트를 등록해야함 
				//alert("수정 버튼 클릭함")
				
				//1. comment의 내용을 input에 출력해주기
				let cno = $(this).parent().attr("data-cno")			// <li>태그는 <button>의 부모임
				let comment = $("span.comment", $(this).parent()).text()		// 클릭된 수정버튼의 부모(li)의 span태그의 텍스트만 가져옴 
				$("input[name=comment]").val(comment)
				
				//2. cno 전달하기
				$("#modBtn").attr("data-cno", cno)
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
			
		})
		
		let toHtml = function(comments) {
			let tmp = "<ul>"
			
			comments.forEach(function(comment) {
				tmp += '<li data-cno=' + comment.cno
				tmp += ' data-pcno=' + comment.pcno
				tmp += ' data-bno=' + comment.bno + '>'
				tmp += ' commenter=<span class="commenter">' +comment.commenter+ '</span>'
				tmp += ' comment=<span class="comment">' +comment.comment+ '</span>'
				tmp += ' <button class="delBtn">삭제</button>'
				tmp += ' <button class="modBtn">수정</button>'
				tmp += '</li>'
			})
			
			return tmp + "</ul>"
		}
	
	</script>
</body>
</html>


