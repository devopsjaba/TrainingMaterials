<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>모든 요청을 받아 처리하기</h3>
	${resultValue }
	<ol>
		<li>URI : ${uri }</li>
		<li>요청명 : ${commandStr }</li>
	</ol>
	<ul>
		<li><a href="../servlet/register.kosta">회원가입</a></li>
		<li><a href="../servlet/login.kosta">로그인</a></li>
		<li><a href="../servlet/board.kosta">게시판</a></li>
	</ul>
</body>
</html>