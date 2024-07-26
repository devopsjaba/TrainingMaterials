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
	<h2>회원 추가</h2>
	<%
		//DB 연결
		JDBCConnectTest jdbc = new JDBCConnectTest();
	
		String sql = "INSERT INTO member (id, pass, name, regidate) VALUES (?, ?, ?, now())";
		jdbc.pstmt = jdbc.con.prepareStatement(sql);
		jdbc.pstmt.setString(1, "kosta2");
		jdbc.pstmt.setString(2, "pass123#");
		jdbc.pstmt.setString(3, "kosta2");
		
		//쿼리 실행
		int result = jdbc.pstmt.executeUpdate();
		out.println(result +"행이 입력되었습니다.");
		
		//DB 연결 닫기
		jdbc.close();
	%>
</body>
</html>




