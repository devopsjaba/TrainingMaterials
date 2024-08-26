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
public class BoardDaoImplTest {

	@Autowired
	private BoardDao boardDao;
	
	@Test
	public void selectTest() throws Exception {
		assertTrue(boardDao != null);
		System.out.println("boardDao = " + boardDao);
		
		BoardDto boardDto = boardDao.select(3);
		System.out.println("boardDto = " + boardDto);
		assertTrue(boardDto.getBno().equals(3));
		
		boardDao.deleteAll();
		boardDto = new BoardDto("Pioneering", "Ready for Action", "kosta");
		boardDao.insert(boardDto);
		
		boardDto = boardDao.select(4);
		System.out.println("boardDto = " + boardDto);
		assertTrue(boardDto.getBno().equals(4));
	}

}












