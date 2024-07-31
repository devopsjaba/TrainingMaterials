<%@page import="kr.co.kosta.el.PersonDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>EL로 객체 매개변수 전달하기</h3>
	<%
		request.setAttribute("personObj", new PersonDTO("홍길동", 30));
		request.setAttribute("stringObj", "문자열 객체");
		request.setAttribute("interObje", new Integer(730));
	%>
	<jsp:forward page="objectResult.jsp">
		<jsp:param value="10" name="firsNum"/>
		<jsp:param value="20" name="secondNum"/>
	</jsp:forward>
</body>
</html>