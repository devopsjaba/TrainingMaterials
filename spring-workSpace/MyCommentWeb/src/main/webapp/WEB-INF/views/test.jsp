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
	<button id="sendBtn" type="button">SEND</button>
	<div id="commentList"></div>
	
	<script type="text/javascript">
		let bno = 1116
		
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
			$("#sendBtn").click(function() {
				showList(bno)
			})
			
			$("#commentList").on("click", ".delBtn", function() {		// commentList안에 있는 delBtn버튼에다가 클릭이벤트를 등록해야함 
				alert("삭제 버튼 클릭함")
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
				tmp += '</li>'
			})
			
			return tmp + "</ul>"
		}
	
	</script>
</body>
</html>


