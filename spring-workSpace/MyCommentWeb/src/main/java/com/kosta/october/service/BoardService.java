package com.kosta.october.service;

import java.util.List;
import java.util.Map;

import com.kosta.october.domain.BoardDto;
import com.kosta.october.domain.SearchItem;

public interface BoardService {

	List<BoardDto> getPage(Map map) throws Exception;
	int getCount() throws Exception;
	List<BoardDto> getSearchResultPage(SearchItem sc) throws Exception;
	int getSearchResultCount(SearchItem sc) throws Exception;
	
	BoardDto read(Integer bno) throws Exception;
	int remove(Integer bno, String writer) throws Exception;
	int write(BoardDto boardDto) throws Exception;
	int modify(BoardDto boardDto) throws Exception;
}
