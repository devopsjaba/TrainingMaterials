package com.kosta.october.dao;

import java.util.List;

import com.kosta.october.domain.CommentDto;

public interface CommentDao {
		int deleteAll(Integer bno) throws Exception;

		List<CommentDto> selectAll(Integer bno) throws Exception;

		int delete(Integer cno, String commenter) throws Exception;
		
		int insert(CommentDto commentDto) throws Exception;
		
		int update(CommentDto commentDto) throws Exception; 
}
