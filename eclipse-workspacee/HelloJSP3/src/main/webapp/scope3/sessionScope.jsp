<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<String> list = new ArrayList<>();
	list.add("코스타");
	list.add("오리역");
	session.setAttribute("list", list);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>session 영역에 저장한 속성 읽기</h2>
	<a href="sessionScope2.jsp">sessionScope2.jsp 바로가기</a>
</body>
</html>