package com.kosta.october.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kosta.october.domain.CommentDto;
import com.kosta.october.service.CommentService;

@Controller
public class CommentController {

	@Autowired
	CommentService commentService;
	
	// 지정된 게시물의 모든 댓글을 가져오는 메서드
	@GetMapping("/comments")		//	/comments?bno=1103      GET 
	@ResponseBody
	//public List<CommentDto> list(Integer bno)
	public ResponseEntity<List<CommentDto>> list(Integer bno) {
		List<CommentDto> list = null;
		
		try {
			list = commentService.getList(bno);
			return new ResponseEntity<List<CommentDto>>(list, HttpStatus.OK);    // 200
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<CommentDto>>(HttpStatus.BAD_REQUEST);    // 400
		}
		//return list;
	}
}
















