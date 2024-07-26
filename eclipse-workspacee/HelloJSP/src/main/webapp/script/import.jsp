<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Date today = new Date();
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");
		String todaystr = dataFormat.format(today);
		out.println("오늘 날짜 : " + todaystr);
	%>
</body>
</html>