<%@page import="kr.co.kosta.common.PersonDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("requestString", "request 영역의 문자열");
	request.setAttribute("requestDTO", new PersonDTO("신사임당", 30));
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>request 영역 속성값 삭제하기</h2>
	<%
		request.removeAttribute("requestString");
		request.removeAttribute("requestString2");	// 에러 없음 
	%>
	
	<h2>request 영역 속성값 읽기</h2>
	<ul>
		<li><%= request.getAttribute("requestString") %></li>
		<li><%= request.getAttribute("requestDTO") %></li>
	</ul>
	
	<h2>포워드</h2>
<%-- 	
	<%
		request.getRequestDispatcher("requestForward.jsp?paramHan=안녕&paramEng=hi").forward(request, response);
	%>
 --%>	
</body>
</html>


















