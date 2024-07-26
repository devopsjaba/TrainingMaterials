<%@page import="kr.co.kosta.common.PersonDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Include 페이지</h4>
	<%
	int pInteger2 =(Integer)pageContext.getAttribute("pageInteger");
	String pString2 = pageContext.getAttribute("pageString").toString();
	PersonDTO pPerson2 = (PersonDTO)pageContext.getAttribute("pageDTO");
	%>
	
	<ul>
		<li><%= pInteger2 %></li>
		<li><%= pString2 %></li>
		<li><%= pPerson2 %></li>
	</ul>	
</body>
</html>