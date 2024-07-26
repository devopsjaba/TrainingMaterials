<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!	//선언부
	public int add(int num1, int num2) {
		return num1 + num2;
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//스크립트릿(자바코드)
	int result = add(10,20);
%>
뎃셈 결과1 : <%= result %> <br/>
뎃셈 결과2 : <%= add(30,40) %>
</body>
</html>