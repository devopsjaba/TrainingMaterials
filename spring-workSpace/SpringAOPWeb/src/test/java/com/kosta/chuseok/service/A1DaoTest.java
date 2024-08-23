package com.kosta.chuseok.service;

import com.kosta.chuseok.service.A1Dao;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // JUnit의 기본 테스트 러너 대신 @RunWith이용해 지정한 클래스를 이용해 테스트 메소드를 수행하도록 지정
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}) //문자열을 이용해 필요한 객체들을 스프링 내에 객체로 등록
public class A1DaoTest {
	@Autowired(required=false)
	A1Dao a1Dao;
	
	@Autowired
	DataSource ds;

	@Test
	public void insertTest() throws Exception {
		//a1Dao.insert(1, 100);
		//a1Dao.insert(2, 100);
		
		a1Dao.insert(1, 100);
		a1Dao.insert(1, 100);
	}

}
