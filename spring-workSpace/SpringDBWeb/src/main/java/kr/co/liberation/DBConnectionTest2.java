package kr.co.liberation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBConnectionTest2 {
	
	public static void main(String[] args) throws SQLException {
		// 데이터베이스 접속 정보 변수 선언
		String DB_URL ="jdbc:mysql://localhost:3306/springbasic?useUnicode=true&characterEncoding=utf8";
		// DB의 사용자정보
		String DB_USER = "kosta";
		String DB_PASSWORD = "pass123#";
		String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(DB_DRIVER);
		ds.setUrl(DB_URL);
		ds.setUsername(DB_USER);
		ds.setPassword(DB_PASSWORD);
		
		//데이터베이스 연결 얻기
		Connection conn = ds.getConnection();
		System.out.println("conn = " + conn);
		
	}

}























