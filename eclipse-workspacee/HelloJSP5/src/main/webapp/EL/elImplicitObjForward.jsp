<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>각 4개 영역에 저장된 속성 공유 여부 확인하기</h3>
	<ul>
		<li>페이지 영역 : ${pageScope.pageScope }</li>
		<li>리퀘스트 영역 : ${requestScope.requestScope }</li>
		<li>세션 영역 : ${sessionScope.sessionScope }</li>
		<li>애플리케이션 영역 : ${applicationScope.applicationScope }</li>	
	</ul>
</body>
</html>