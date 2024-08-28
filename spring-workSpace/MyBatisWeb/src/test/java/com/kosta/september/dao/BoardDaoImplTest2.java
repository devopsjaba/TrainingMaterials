package com.kosta.september.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kosta.september.domain.BoardDto;

@RunWith(SpringJUnit4ClassRunner.class) // JUnit의 기본 테스트 러너 대신 @RunWith이용해 지정한 클래스를 이용해 테스트 메소드를 수행하도록 지정
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}) //문자열을 이용해 필요한 객체들을 스프링 내에 객체로 등록
public class BoardDaoImplTest2 {

	@Autowired
	private BoardDao boardDao;
	
	@Test
	public void insertDummyDataTest() throws Exception {
		boardDao.deleteAll();
		
		for(int i=1; i <= 250; i++) {
			BoardDto boardDto = new BoardDto("Pioneering" + i, "취업 준비..", "kosta");
			boardDao.insert(boardDto);
		}
			
	}

}
