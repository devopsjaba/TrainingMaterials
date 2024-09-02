package com.kosta.october.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kosta.october.domain.BoardDto;
import com.kosta.october.domain.SearchItem;


@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSession session;
	private static String namespace = "com.kosta.october.dao.BoardMapper.";
	
	@Override
	public BoardDto select(Integer bno) throws Exception {
		return session.selectOne(namespace + "select", bno);
	}

	@Override
	public int deleteAll() throws Exception {
		return session.delete(namespace + "deleteAll");
	}

	@Override
	public int insert(BoardDto dto) throws Exception {
		return session.insert(namespace + "insert", dto);
	}

	@Override
	public int delete(Integer bno, String writer) throws Exception {
		Map map = new HashMap();
		map.put("bno", bno);
		map.put("writer", writer);
		return session.delete(namespace + "delete", map);
	}

	@Override
	public int update(BoardDto boardDto) throws Exception {
		return session.update(namespace + "update", boardDto);
	}

	@Override
	public int count() throws Exception {
		return session.selectOne(namespace + "count");
	}

	@Override
	public List<BoardDto> selectPage(Map map) throws Exception {
		return session.selectList(namespace + "selectPage", map) ;
	}

	@Override
	public int increaseViewCnt(Integer bno) throws Exception {
		
		return session.update(namespace + "increaseViewCnt", bno);
	}

	@Override
	public List<BoardDto> searchSelectPage(SearchItem sc) throws Exception {
		return session.selectList(namespace + "searchSelectPage", sc);
	}

	@Override
	public int searchResultCnt(SearchItem sc) throws Exception {
		return session.selectOne(namespace + "searchResultCnt", sc);
	}

}









