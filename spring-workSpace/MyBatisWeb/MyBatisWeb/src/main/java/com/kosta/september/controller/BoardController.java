package com.kosta.september.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kosta.september.domain.BoardDto;
import com.kosta.september.domain.PageResolver;
import com.kosta.september.domain.SearchItem;
import com.kosta.september.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	BoardService boardService;

	@PostMapping("/modify")
	public String modify(BoardDto boardDto, Integer page, Integer pageSize, RedirectAttributes rattr, Model m, HttpSession session) {
		String writer = (String) session.getAttribute("id");
		boardDto.setWriter(writer);
		
		try {
			if(boardService.modify(boardDto) !=1)
				throw new Exception("Modify Failed");
			rattr.addAttribute("page", page);
			rattr.addAttribute("pageSize", pageSize);
			rattr.addFlashAttribute("msg", "MOD_OK");
			return "redirect:/board/list";
			
		} catch(Exception e) {
			e.printStackTrace();
			m.addAttribute(boardDto);
			m.addAttribute("page", page);
			m.addAttribute("pageSize", pageSize);
			m.addAttribute("msg", "MOD_ERR");
			return "board";
		}

	}
	
	@PostMapping("/write")
	public String write(BoardDto boardDto, RedirectAttributes rattr, Model m, HttpSession session ) {
		String writer = (String) session.getAttribute("id");
		boardDto.setWriter(writer);
		
		try {
			if(boardService.write(boardDto) != 1)
				throw new Exception("Write Failed");
			
			rattr.addFlashAttribute("msg", "WRT_OK");
			return "redirect:/board/list";
		
		} catch(Exception e) {
			e.printStackTrace();
			m.addAttribute("mode", "new");					// 글쓰기 모드
			m.addAttribute("boardDto", boardDto);		// 등록하려던 내용을 보여줘야 함 
			m.addAttribute("msg", "WRT_ERR");
			return "board";
		}
	}
	
	@GetMapping("/write")
	public String write(Model m) {
		m.addAttribute("mode", "new");		// board.jsp 읽기와 쓰기에 사용. 쓰기에 사용할때는 mode=new 
		return "board";
	}
	
	@PostMapping("/remove")
	public String remove(Integer bno, Integer page, Integer pageSize, RedirectAttributes rattr, HttpSession session) {
		String writer = (String) session.getAttribute("id");
		String msg = "DEL_OK";
		
		try {
			if(boardService.remove(bno, writer) != 1) 
				throw new Exception("Delete failed.");
		} catch (Exception e) {
			e.printStackTrace();
			msg = "DEL_ERR";
		}
		
		rattr.addAttribute("page", page);
		rattr.addAttribute("pageSize", pageSize);
		//rattr.addAttribute("msg", msg);
		rattr.addFlashAttribute("msg", msg);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/read")
	public String read(Integer bno, Integer page, Integer pageSize, Model m) {
		
		try {
			BoardDto boardDto = boardService.read(bno);
			//m.addAttribute("boardDto", boardDto);
			m.addAttribute(boardDto);
			m.addAttribute("page", page);
			m.addAttribute("pageSize", pageSize);
			
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/board/list";
		}
		
		return "board";
	}
	
	@GetMapping("/list")
	public String list(/* @ModelAttribute */ SearchItem sc, Model m, HttpServletRequest request) {
		
		// 로그인 안했으면 로그인 화면으로 이동 
		if(!loginCheck(request))
			return "redirect:/login/login?toURL="+request.getRequestURL();
				
		try {
			
//			if(page==null) page=1;
//			if(pageSize==null) pageSize=10;
			
			int totalCnt = boardService.getSearchResultCount(sc);
			m.addAttribute("totalCnt", totalCnt);
			
			PageResolver pageResolver = new PageResolver(totalCnt, sc);
			m.addAttribute("pr", pageResolver);
			
			List<BoardDto> list = boardService.getSearchResultPage(sc);
			m.addAttribute("list", list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "boardList";		// 로그인 한 상태이면 게시판 목록 화면으로 이동
	}

	private boolean loginCheck(HttpServletRequest request) {
		//세션을 얻어서
		HttpSession session = request.getSession();
		//세션에 id가 있는지 확인, 있으면 true반환
		return session.getAttribute("id") != null;		//true 반환, null이면 false반환
	}
}



