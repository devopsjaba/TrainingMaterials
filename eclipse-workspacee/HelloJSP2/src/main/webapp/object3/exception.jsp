<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int status = response.getStatus();
	System.out.println(status);
	
	if(status == 404) {
		out.print("404 에러 발생하였습니다.");
		out.print("<br/> 해당 요청이 잘못되었습니다.");
	}
	else if(status == 500) {
		out.print("500 에러 발생하였습니다.");
		out.print("<br/> 소스 코드에 오류가 없는지 확인해 주세요.");		
	}
%>
</body>
</html>