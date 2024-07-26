<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>pageContextScope2.jsp 이동 후 속성값 읽기</h2>
	<%
			Object pInteger = pageContext.getAttribute("pageInteger");
			Object pString = pageContext.getAttribute("pageString");
			Object pPerson = pageContext.getAttribute("pageDTO");
	%>
	<ul>
		<li><%= pInteger %></li>
		<li><%= pString %></li>
		<li><%= pPerson %></li>
	</ul>	
</body>
</html>