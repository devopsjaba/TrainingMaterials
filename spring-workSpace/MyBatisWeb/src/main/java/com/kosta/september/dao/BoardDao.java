package com.kosta.september.dao;

import com.kosta.september.domain.BoardDto;

public interface BoardDao {
	
	BoardDto select(Integer bno) throws Exception;

	int deleteAll() throws Exception;

	int insert(BoardDto boardDto) throws Exception;
	
	int delete(Integer bno, String writer) throws Exception;
	
	int update(BoardDto boardDto) throws Exception;
}
