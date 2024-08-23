package kr.co.liberation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {
	
	public static void main(String[] args) throws SQLException {
		// 데이터베이스 접속 정보 변수 선언
		String DB_URL ="jdbc:mysql://localhost:3306/springbasic?useUnicode=true&characterEncoding=utf8";
		// DB의 사용자정보
		String DB_USER = "kosta";
		String DB_PASSWORD = "pass123#";
		
		// 1) 데이터베이스 연결 얻기 (Connection 객체 생성)
		Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		
		// 2) Statement 객체 생성
		Statement stmt = conn.createStatement();
		
		// 시스템의 현 날짜시간 출력
		String query = "select now()";
		
		// 3) Statement 객체의 executeQuery() 실행 =>  ResultSet 객체 생성
		ResultSet rs = stmt.executeQuery(query);
		
		// 4) 실행결과 담긴 rs에서 한줄씩 읽어서 출력
		while(rs.next()) {
			String curDate = rs.getString(1);	//읽어온 행의 첫번째 컬럼의 값을 String으로 읽어서 curDate에 저장 
			System.out.println(curDate);
		}
	}

}























