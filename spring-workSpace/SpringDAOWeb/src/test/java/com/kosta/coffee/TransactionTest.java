package com.kosta.coffee;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // JUnit의 기본 테스트 러너 대신 @RunWith이용해 지정한 클래스를 이용해 테스트 메소드를 수행하도록 지정
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}) //문자열을 이용해 필요한 객체들을 스프링 내에 객체로 등록
public class TransactionTest {

	@Autowired 
	DataSource ds;
	
	@Test
	public void transactionTest() throws SQLException  {
		Connection conn=null;
		
		try {
			deleteAll();
			conn = ds.getConnection();
			//conn.setAutoCommit(false);
			
			String sql = "insert into user values (?, ?, ?, ?, ?, ?, now() )";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "kosta");
			pstmt.setString(2, "0821");
			pstmt.setString(3, "kosta");
			pstmt.setString(4, "kosta@gmail.com");
			pstmt.setDate(5, new java.sql.Date(new Date().getTime()));
			pstmt.setString(6, "fb");
			
			int rowCnt = pstmt.executeUpdate();
			
			pstmt.setString(1, "kosta11");
			rowCnt = pstmt.executeUpdate();
			
			//conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			conn.rollback();
		}

		
	}

	private void deleteAll() throws SQLException {
		Connection conn = ds.getConnection();
		String sql = "delete from user";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
		
	}
	
}



















