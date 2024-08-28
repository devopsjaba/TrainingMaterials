package com.kosta.september.dao;

import java.util.List;
import java.util.Map;

import com.kosta.september.domain.BoardDto;

public interface BoardDao {
	
	BoardDto select(Integer bno) throws Exception;
	List<BoardDto> selectPage(Map map) throws Exception;
	
	int count() throws Exception;

	int deleteAll() throws Exception;

	int insert(BoardDto boardDto) throws Exception;
	
	int delete(Integer bno, String writer) throws Exception;
	
	int update(BoardDto boardDto) throws Exception;
	int increaseViewCnt(Integer bno) throws Exception;
}
