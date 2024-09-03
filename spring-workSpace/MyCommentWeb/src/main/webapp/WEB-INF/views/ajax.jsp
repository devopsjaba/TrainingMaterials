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
	<h2>{name: "kosta", age: 31}</h2>
	<button id="sendBtn" type="button">SEND</button>
	
	<h2>Data from Server : </h2>
	<div id="data"></div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			let person = {name:"kosta", age:10}
			let person2 = {}
			$("#sendBtn").click(function() {
				$.ajax({
					type : 'post',						//요청 메서드
					url : '/october/send',			//요청 URI 
					headers : { "content-type" : "application/json"},		//요청 헤더 
					data : JSON.stringify(person),	// 서버로 전송할 데이터. stringify()로 직렬화함 
					dataType : 'text',				// 전송받을 데이터의 타입 
					success : function(result) {			// 서버로부터 응답이 도착하면 호출될 함수 
						person2 = JSON.parse(result)	// result는 서버가 전송한 데이터 
						alert("received : " + result)
						$("#data").html("name = " + person2.name+ ", age = " + person2.age)
					},
					error : function() { alert("error")	} 		// 에러가 발생했을 때, 호출될 함수 
				})
				
				alert("the request is sent")
				
			})
		})
	</script>
</body>
</html>










