package com.kosta.september.dao;

import java.util.List;
import java.util.Map;

import com.kosta.september.domain.BoardDto;
import com.kosta.september.domain.SearchItem;

public interface BoardDao {
	
	BoardDto select(Integer bno) throws Exception;
	List<BoardDto> selectPage(Map map) throws Exception;
	List<BoardDto> searchSelectPage(SearchItem sc)  throws Exception;
	
	int count() throws Exception;
	int searchResultCnt(SearchItem sc) throws Exception;

	int deleteAll() throws Exception;

	int insert(BoardDto boardDto) throws Exception;
	
	int delete(Integer bno, String writer) throws Exception;
	
	int update(BoardDto boardDto) throws Exception;
	int increaseViewCnt(Integer bno) throws Exception;
	
}
