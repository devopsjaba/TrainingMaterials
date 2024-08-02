package kr.co.kosta.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnPoolTest {
	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	public DBConnPoolTest() {
		
		try {
			//DataSource(Connection Pool) 얻기
			Context context = new InitialContext();
			Context ctx = (Context) context.lookup("java:comp/env");
			DataSource dataSource = (DataSource) ctx.lookup("dbcp_mysql");
			
			// 커넥션 풀을 통해 연결 객체 얻기
			con =dataSource.getConnection();
			
			System.out.println("DB 연결 성공(커넥션 풀)");
			
		} catch (NamingException | SQLException e) {
			System.out.println("DB 연결 실패(커넥션 풀)");
			e.printStackTrace();
		}
	}
	
	//연결 해제 및 자원 반납
	public void close() {
		try {
			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (stmt != null) stmt.close();
			if (con != null) con.close();				
			
			System.out.println("JDBC 자원 해제");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
