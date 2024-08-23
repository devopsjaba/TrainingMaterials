package com.kosta.chuseok.service2;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@RunWith(SpringJUnit4ClassRunner.class) // JUnit의 기본 테스트 러너 대신 @RunWith이용해 지정한 클래스를 이용해 테스트 메소드를 수행하도록 지정
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}) //문자열을 이용해 필요한 객체들을 스프링 내에 객체로 등록
public class A1DaooTest {
	@Autowired
	A1Daoo a1Daoo;
	
	@Autowired
	DataSource ds;

	@Test
	public void test() throws Exception {
		
		//TxManager 생성
		PlatformTransactionManager  tm = new DataSourceTransactionManager(ds);
		//Tx 시작
		TransactionStatus status = tm.getTransaction(new DefaultTransactionDefinition());
		
		try {
			a1Daoo.deleteAll();
			a1Daoo.insert(1, 100);		// 개별 커넥션이지만 DataSourceTransactionManager가 같은 커넥션을 사용하게 해줌 
			a1Daoo.insert(1, 200);	
			tm.commit(status); 			// Tx 끝 -- 성공
		} catch (Exception e) {
			tm.rollback(status);           // Tx 끝 -- 실패하면 롤백 
		}

	}

}











