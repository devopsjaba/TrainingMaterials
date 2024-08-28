package com.kosta.september.service;

import java.util.List;
import java.util.Map;

import com.kosta.september.domain.BoardDto;

public interface BoardService {

	List<BoardDto> getPage(Map map) throws Exception;
	int getCount() throws Exception;
	BoardDto read(Integer bno) throws Exception;
	int remove(Integer bno, String writer) throws Exception;
}
