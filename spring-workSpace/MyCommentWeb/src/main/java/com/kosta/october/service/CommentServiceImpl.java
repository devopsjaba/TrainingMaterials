package com.kosta.october.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosta.october.dao.BoardDao;
import com.kosta.october.dao.CommentDao;
import com.kosta.october.domain.CommentDto;

@Service
public class CommentServiceImpl implements CommentService {
	
	BoardDao boardDao;
	CommentDao commentDao;
	
	//@Autowired
	public CommentServiceImpl(BoardDao boardDao, CommentDao commentDao) {
		this.boardDao = boardDao;
		this.commentDao = commentDao;
	}

	@Override
	public List<CommentDto> getList(Integer bno) throws Exception {
		//throw new Exception("test");
		return commentDao.selectAll(bno);
	}

}




