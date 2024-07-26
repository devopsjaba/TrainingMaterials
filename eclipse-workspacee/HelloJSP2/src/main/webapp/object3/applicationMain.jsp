<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	public String useObject() {
		return this.getServletContext().getRealPath("object3");
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>web.xml에 설정한 파라미터 읽어오기</h2>
	<%= application.getInitParameter("INIT_PARAM") %>
	
	<h2>서버의 물리적 경로 </h2>
	<%= application.getRealPath("object3") %>
	<br/>
	<%= useObject() %>
</body>
</html>