package kr.co.kosta.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.kosta")
public class FrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		int lastSlash = uri.lastIndexOf("/");
		String commandStr = uri.substring(lastSlash);
		
		if (commandStr.equals("/register.kosta"))
			registFunc(request);
		else if (commandStr.equals("/login.kosta"))
			loginFunc(request);
		else if (commandStr.equals("/board.kosta"))
			boardFunc(request);		
		
		request.setAttribute("uri", uri);
		request.setAttribute("commandStr", commandStr);
		request.getRequestDispatcher("/servlet/frontController.jsp").forward(request, response);
		
		
	}

	public void boardFunc(HttpServletRequest request) {
		request.setAttribute("resultValue", "<h4>게시판</h4>");
		
	}

	public void loginFunc(HttpServletRequest request) {
		request.setAttribute("resultValue", "<h4>로그인</h4>");
		
	}

	public void registFunc(HttpServletRequest request) {
		request.setAttribute("resultValue", "<h4>회원 가입</h4>");
	}
}

















