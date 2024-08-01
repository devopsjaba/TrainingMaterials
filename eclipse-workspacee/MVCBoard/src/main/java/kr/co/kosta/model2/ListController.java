package kr.co.kosta.model2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		MVCBoardDAO dao = new MVCBoardDAO();
	
		//게시물 목록 받기 
		
		
		request.getRequestDispatcher("/board/list.jsp").forward(request, response);
	}

}
