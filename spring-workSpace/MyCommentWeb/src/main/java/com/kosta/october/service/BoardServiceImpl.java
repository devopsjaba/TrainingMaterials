package com.kosta.october.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosta.october.dao.BoardDao;
import com.kosta.october.domain.BoardDto;
import com.kosta.october.domain.SearchItem;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao boardDao;

	@Override
	public List<BoardDto> getPage(Map map) throws Exception {
		return boardDao.selectPage(map);
	}

	@Override
	public int getCount() throws Exception {
		return boardDao.count();
	}

	@Override
	public BoardDto read(Integer bno) throws Exception {
		BoardDto boardDto = boardDao.select(bno);
		// 조회수 증가(비즈니스 로직처리)
		boardDao.increaseViewCnt(bno);
		return  boardDto;
	}

	@Override
	public int remove(Integer bno, String writer) throws Exception {
		return boardDao.delete(bno, writer);
	}

	@Override
	public int write(BoardDto boardDto) throws Exception {
		return boardDao.insert(boardDto);
		//throw new Exception();
	}

	@Override
	public int modify(BoardDto boardDto) throws Exception {
		return boardDao.update(boardDto);
		//throw new Exception();
	}

	@Override
	public List<BoardDto> getSearchResultPage(SearchItem sc) throws Exception {
		return boardDao.searchSelectPage(sc);
	}

	@Override
	public int getSearchResultCount(SearchItem sc) throws Exception {
		return boardDao.searchResultCnt(sc);
	}
	
	
}





