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
		try {
			int myAge = Integer.parseInt(request.getParameter("age")) + 10; //에러 발생
			out.println("당신의 나이는 " +myAge+ "입니다.");			
		} catch (Exception e) {
			out.println("예외 발생 함 : 매개변수 age의 값이 null임");
		}

	
	%>
</body>
</html>