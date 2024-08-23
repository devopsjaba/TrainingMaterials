<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<c:set var="loginout" value="${sessionScope.id==null ? 'Login' : 'Logout' }" />
<c:set var="loginoutlink" value="${sessionScope.id==null ? '/login/login' : '/login/logout' }" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value='/resources/css/menu.css' />"/>
<title>Insert title here</title>
</head>
<body>
	<div id="menu">
		<ul>
			<li id="logo">kosta</li>
			<li><a href="<c:url value="/" />">Home</a></li>
			<li><a href="<c:url value="/board/list" />">Board</a></li>
			<li><a href="<c:url value="${loginoutlink}" />">${loginout}</a></li>
			<li><a href="<c:url value="/register/add" />">SignUp</a></li>
			<li><a href=""><i class="fa fa-search small"></i></a></li>
		</ul>
	</div>
	<div style="text-align: center;">
		<h2>당신의 심장을 예의 주시하다</h2>
		<h2>혈중 산소 포화도 측정. 살아 숨쉬는 혁신</h2>
		<h2>‘수면’ 앱의 역할은 수면 시간 기록에만 국한되지 않습니다.</h2>
		<h2>Apple Watch의 ‘마음 챙기기’ 앱에서 여러 가지 다른 기분을 나타내는 매력적인 이미지를 스크롤하여 순간의 감정과 그날의 기분을 기록할 수 있습니다.</h2>
		<h2>Apple Watch는 당신의 정신 건강 및 신체 건강에 대해 더욱 잘 이해할 수 있도록 도와줍니다.</h2>
	</div>
</body>
</html>














