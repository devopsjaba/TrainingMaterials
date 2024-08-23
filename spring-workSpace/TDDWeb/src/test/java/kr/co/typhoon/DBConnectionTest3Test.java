package kr.co.typhoon;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // JUnit의 기본 테스트 러너 대신 @RunWith이용해 지정한 클래스를 이용해 테스트 메소드를 수행하도록 지정
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}) //문자열을 이용해 필요한 객체들을 스프링 내에 객체로 등록
public class DBConnectionTest3Test {
	@Autowired
	DataSource ds;
	
	@Test
	public void springJdbcConnectionTest() throws SQLException {
//		ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");	
//		DataSource ds = ac.getBean(DataSource.class);
		
		//데이터베이스 연결 얻기
		Connection conn = ds.getConnection();
		System.out.println("conn = " + conn);
		
		// 괄호 안의 조건식이 true이면 테스트 성공, 아니면 실패 
		assertTrue(conn!=null);
	}
}







