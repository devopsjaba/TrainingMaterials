package com.kosta.october.service;

import java.util.List;

import com.kosta.october.domain.CommentDto;

public interface CommentService {

	List<CommentDto> getList(Integer bno) throws Exception;

}
