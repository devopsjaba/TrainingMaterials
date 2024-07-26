<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="isErrorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
			int myAge = Integer.parseInt(request.getParameter("age")) + 10; //에러 발생
			out.println("당신의 나이는 " +myAge+ "입니다.");			
	%>
</body>
</html>