<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="formResult.jsp" method="post">
		이름 : <input type="text" name="name" /><br/>
		성별 : <input type="radio" name="gender" value="Man" />남자
			  <input type="radio" name="gender" value="WoMan" />여자<br/>
		학력 : <select name="grade">
				<option value="ele">초등</option>
				<option value="mid">중등</option>
				<option value="high">고등</option>
				<option value="uni">대학</option>
			  </select><br/>		
		관심 사항 : 
				<input type="checkbox" name="interesting" value="pol" />정치	
				<input type="checkbox" name="interesting" value="eco" />경제
				<input type="checkbox" name="interesting" value="ent" />연애
				<input type="checkbox" name="interesting" value="spo" />운동<br/>
		<input type="submit" value="전송하기" />						  	  		
	</form>
</body>
</html>





