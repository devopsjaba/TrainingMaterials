<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>페이지 이동 후 session 영역 값 읽기</h2>
	<%
		ArrayList<String> list = (ArrayList<String>)session.getAttribute("list");
		for(String str : list)
			out.print(str + "<br/>");
	%>
</body>
</html>