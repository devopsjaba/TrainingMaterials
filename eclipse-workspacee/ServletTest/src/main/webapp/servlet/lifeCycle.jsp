<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		function requstAction(frm, met) {
			if (met == 1) 
				frm.method = 'get'
			else 
				frm.method = 'post'
			frm.submit()				
		}
	</script>
	
	<h2>서블릿 수명주기(Life Cycle)</h2>
	<form action="./lifeCycle.do">
		<input type="button" value="Get 방식 요청" onclick="requstAction(this.form, 1)" />
		<input type="button" value="Post 방식 요청" onclick="requstAction(this.form, 2)" />
	</form>
</body>
</html>