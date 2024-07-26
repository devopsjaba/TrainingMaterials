<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>포워드된 페이지</h2>
	<h4>리퀘스트 영역 속성 읽기</h4>
	<ul>
		<li>String 객체 : <%= request.getAttribute("requestString") %></li>
		<li>PersonDTO 객체 : <%= request.getAttribute("requestDTO") %></li>
	</ul>	
	<h4>매개변수로 전달된 값 출력하기</h4>
	<%
		request.setCharacterEncoding("UTF-8");
		out.println(request.getParameter("paramHan"));
		out.println(request.getParameter("paramEng"));
	%>
</body>
</html>