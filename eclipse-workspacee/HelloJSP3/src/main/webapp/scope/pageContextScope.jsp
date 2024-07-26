<%@page import="kr.co.kosta.common.PersonDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	pageContext.setAttribute("pageInteger", 1000);
	pageContext.setAttribute("pageString", "페이지 영역의 문자열");
	pageContext.setAttribute("pageDTO", new PersonDTO("이순신", 20));
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>page 영역 속성값 읽기</h2>
	<%
		int pInteger =(Integer)pageContext.getAttribute("pageInteger");
		String pString = pageContext.getAttribute("pageString").toString();
		PersonDTO pPerson = (PersonDTO)pageContext.getAttribute("pageDTO");
	%>
	<ul>
		<li><%= pInteger %></li>
		<li><%= pString %></li>
		<li><%= pPerson %></li>
	</ul>
	
	<%@ include file="pageContextInclude.jsp" %>
	
	<h2>페이지 이동</h2>
	<a href="pageContextScope2.jsp">pageContextScope2.jsp 바로가기</a>
</body>
</html>







