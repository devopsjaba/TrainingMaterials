<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인 페이지</h2>
	
	<script type="text/javascript">
		function validateForm(form) {
			if(!form.user_id.value) {
				alert("아이디를 입력하세요.")
				return false;
			}
			if(!form.user_pw.value) {
				alert("패스워드를 입력하세요.")
				return false;
			}			
		}
	</script>
	
	<form action="loginServer.jsp" method="post" name="loginFrm" onsubmit="return validateForm(this)">
		아이디 : <input type="text" name="user_id" /><br/>
		패스워드 : <input type="password" name="user_pw" /><br/>
		<input type="submit" value="로그인하기" />
	</form>
</body>
</html>