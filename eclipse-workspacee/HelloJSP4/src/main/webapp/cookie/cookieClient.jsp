<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 쿠키값 확인하기(추가된 쿠키 생성 여부 확인) </h2>
	<%
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie c : cookies) {
				String cookieName = c.getName();
				String cookieValue = c.getValue();
				out.println(String.format("%s : %s", cookieName, cookieValue));
			}
		}
	%>
</body>
</html>