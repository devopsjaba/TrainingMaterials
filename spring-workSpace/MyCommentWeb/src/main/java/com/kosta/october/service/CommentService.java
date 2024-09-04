package com.kosta.october.service;

import java.util.List;

import com.kosta.october.domain.CommentDto;

public interface CommentService {

	List<CommentDto> getList(Integer bno) throws Exception;

	int remove(Integer cno, Integer bno, String commenter) throws Exception;
	
	int write(CommentDto dto) throws Exception;

	int modify(CommentDto dto) throws Exception;
}
