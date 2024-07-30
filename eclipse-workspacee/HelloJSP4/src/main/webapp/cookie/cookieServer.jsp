<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie cookie = new Cookie("myCookie", "오마이쿠키");
	cookie.setPath(request.getContextPath());	//경로를 켄텍스트 루트로 설정
	cookie.setMaxAge(3600);		// 유지 기간 설정(1시간)
	response.addCookie(cookie);	// 응답 헤더에 쿠키 추가 
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 쿠키 설정 직후 쿠키값 확인하기 </h2>
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
	
	<h2> 페이지 이동 후 쿠키값 확인하기</h2>
	<a href="cookieClient.jsp">다른 페이지 요청에서 쿠키값 확인</a>
</body>
</html>




