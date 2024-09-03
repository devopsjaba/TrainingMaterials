package com.kosta.october.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kosta.october.domain.CommentDto;

@Repository
public class CommentDaoImpl implements CommentDao {

	@Autowired
	private SqlSession session;
	private static String namespace = "com.kosta.october.dao.CommentMapper.";
	
	@Override
	public int deleteAll(Integer bno) throws Exception {
		return session.delete(namespace + "deleteAll", bno);
	}

	@Override
	public List<CommentDto> selectAll(Integer bno) throws Exception {
		return session.selectList(namespace + "selectAll", bno);
	}

}
