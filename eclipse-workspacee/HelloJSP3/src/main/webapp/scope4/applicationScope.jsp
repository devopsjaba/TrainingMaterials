<%@page import="kr.co.kosta.common.PersonDTO"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>application 영역</h2>
	<%
		Map<String, PersonDTO> map = new HashMap<>();
		map.put("person1", new PersonDTO("코스타", 20));
		map.put("person2", new PersonDTO("오리역3", 30));
		application.setAttribute("map", map);
	%>
</body>
</html>