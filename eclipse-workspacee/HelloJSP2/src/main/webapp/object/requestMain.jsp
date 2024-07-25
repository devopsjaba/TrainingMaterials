<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>1. 클라이언트와 서버의 환경정보</h2>
	<a href="./requestWebInfo.jsp?eng=Hello&han=안녕하세요">GET 방식 요청하기</a>
	<br/>
	
	<form action="requestWebInfo.jsp" method="post">
		영어 : <input type="text" name="eng" value="Bye" /><br/>
		한글 : <input type="text" name="han" value="안녕하세요2" /><br/>
		<input type="submit" value="POST 방식 요청하기" />
	</form>
	
	<h2>2. 클라이언트 요청 매개변수 </h2>
	<form method="post" action="requestParameter.jsp">
		아이디 : <input type="text" name="id" value="" /><br/>
		성별 : 
			<input type="radio" name="sex" value="man" />남자
			<input type="radio" name="sex" value="waman" checked />여자
			<br/>
		관심사항 :
			<input type="checkbox" name="favo" value="eco" />경제	
			<input type="checkbox" name="favo" value="pol" checked />정치
			<input type="checkbox" name="favo" value="ent" />연얘<br/>
		자기소개: 
			<textarea rows="4" cols="30" name="intro"></textarea>
			<br/>
			<input type="submit" value="전송하기"/>			
	</form>
	
	<h2>3. HTTP 요청 헤더 정보 </h2>
	<a href="requestHeader.jsp">요청 헤더 정보 읽기</a>
</body>
</html>









