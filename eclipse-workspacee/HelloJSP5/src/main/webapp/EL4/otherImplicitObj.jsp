<%@page import="kr.co.kosta.util.CookieManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	CookieManager.makeCookie(response, "ELCookie", "EL좋아요", 60);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>쿠키값 확인하기</h3>
	<li>ELCookie 값 : ${cookie.ELCookie.value }</li>
	
	<h3>HTTP 헤더 읽기</h3>
	<ul>
		<li>host: ${header.host }</li>
		<li>user-agent: ${header['user-agent'] }</li>
	</ul>
	
	<h3>context 초기화 매개변수 값 읽기</h3>
	<li>MySQLDriver : ${initParam.MySQLDriver }</li>
	
	<h3>context 루트 경로 읽기</h3>
	<li>${pageContext.request.contextPath }</li>
</body>
</html>



