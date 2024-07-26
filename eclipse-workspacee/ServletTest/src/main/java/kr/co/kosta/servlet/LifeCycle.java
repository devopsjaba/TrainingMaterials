package kr.co.kosta.servlet;

import java.io.IOException;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet/lifeCycle.do")
public class LifeCycle extends HttpServlet {

	@PostConstruct
	public void myPostConstruct() {
		System.out.println("@PostConstruct (전처리) 호출");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출");
	}
	
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) 
//			throws ServletException, IOException {
//		System.out.println("service() 호출");
//		request.getRequestDispatcher("/servlet/lifeCycle.jsp").forward(request, response);
//	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 호출");
		request.getRequestDispatcher("/servlet/lifeCycle.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("doPost() 호출");
		request.getRequestDispatcher("/servlet/lifeCycle.jsp").forward(request, response);
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() 호출");
	}
	
	@PreDestroy
	public void myPreDestroy() {
		System.out.println("@PreDestroy (후처리) 호출");
	}
}







