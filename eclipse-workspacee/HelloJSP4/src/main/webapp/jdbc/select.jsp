<%@page import="java.sql.Date"%>
<%@page import="kr.co.kosta.jdbc.JDBCConnectTest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 목록 조회</h2>
	<%
		JDBCConnectTest jdbc = new JDBCConnectTest();
	
		//쿼리문 준비하기
		String sql = "SELECT id, pass, name, regidate FROM member";
		jdbc.stmt = jdbc.con.createStatement();
		
		//쿼리 실행
		jdbc.rs = jdbc.stmt.executeQuery(sql);
		
		while(jdbc.rs.next()) {
			String id = jdbc.rs.getString(1);
			String pw = jdbc.rs.getString(2);
			String name = jdbc.rs.getString(3);
			Date regidate = jdbc.rs.getDate(4);
			
			out.println(String.format("%s %s %s %s", id, pw, name, regidate) + "<br/>");
		}
	
		jdbc.close();
	%>
</body>
</html>





