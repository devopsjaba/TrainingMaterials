<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int myAge = Integer.parseInt(request.getParameter("age")) + 39; //에러 발생
		out.println(myAge);
	
	%>
</body>
</html>