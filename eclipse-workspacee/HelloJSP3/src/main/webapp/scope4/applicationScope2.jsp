<%@page import="java.util.Set"%>
<%@page import="kr.co.kosta.common.PersonDTO"%>
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
	<h2>application 영역 속성 읽기</h2>
	<%
		Map<String, PersonDTO> map = (Map<String, PersonDTO>)application.getAttribute("map");
		Set<String> keys = map.keySet();
		for(String key : keys) {
			PersonDTO personDTO = map.get(key);
			out.print(String.format("이름 : %s, 나이 : %d<br/>", personDTO.getName(), personDTO.getAge()));
		}
	%>
</body>
</html>