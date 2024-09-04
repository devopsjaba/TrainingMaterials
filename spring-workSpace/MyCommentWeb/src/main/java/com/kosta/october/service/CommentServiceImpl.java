package com.kosta.october.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int remove(Integer cno, Integer bno, String commenter) throws Exception {
		int rowCnt = boardDao.updateCommentCnt(bno, -1);
		System.out.println(" updateCommentCnt - rowCnt = " + rowCnt);
		
		rowCnt = commentDao.delete(cno, commenter);
		System.out.println("rowCnt = " + rowCnt);
		return rowCnt;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int write(CommentDto dto) throws Exception {
		boardDao.updateCommentCnt(dto.getBno(), 1);
		return commentDao.insert(dto);
	}

	@Override
	public int modify(CommentDto dto) throws Exception {
		return commentDao.update(dto);
	}

}




