package kr.co.kosta.model2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		MVCBoardDAO dao = new MVCBoardDAO();
		Map<String, Object> map = new HashMap<>();
		
		String searchField = request.getParameter("searchField");
		String searchWord = request.getParameter("searchWord");
		
		//검색어가 있다면
		if (searchWord != null) {
			map.put("searchField", searchField);
			map.put("searchWord", searchWord);
		}
		
		int totalCount = dao.selectCount(map);			//게시물 갯수 
	
		
		
		
		//게시물 목록 받기 
		List<MVCBoardDTO> boardLists = dao.selectListPage(map);
		
		request.setAttribute("boardLists", boardLists);
		
		request.getRequestDispatcher("/board/list.jsp").forward(request, response);
	}

}
