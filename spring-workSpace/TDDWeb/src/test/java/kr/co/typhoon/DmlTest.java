package kr.co.typhoon;

import static org.junit.Assert.assertTrue;

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
public class DmlTest {
	@Autowired
	DataSource ds;
	
	@Test
	public void springJdbcConnTest() throws SQLException {
		Connection conn = ds.getConnection();
		System.out.println("conn = " + conn);
		assertTrue(conn != null);
	}
	
	// 사용자 정보를 user 테이블에 저장하는 메서드 
	public int insertUser(User user) throws Exception {
		Connection conn = ds.getConnection();
		
		String sql = "insert into user values (?, ?, ?, ?, ?, ?, now() )";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getId());
		pstmt.setString(2, user.getPwd());
		pstmt.setString(3, user.getName());
		pstmt.setString(4, user.getEmail());
		pstmt.setDate(5, new java.sql.Date(user.getBirth().getTime()));
		pstmt.setString(6, user.getSns());

		int rowCnt = pstmt.executeUpdate();
		
		return rowCnt;
	}
	
	@Test
	public void insertUserTest() throws Exception {
		User user = new User("user1", "0819", "user1", "user1@gmail.com", new Date(), "fb", new Date());
		int rowCnt = insertUser(user);
		
		assertTrue(rowCnt == 1);
	}
}








