package kr.co.kosta.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Servlet/AnnoMapping.do")
public class AnnoMappingServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("message2", "@WebServlet으로 매핑함");
		request.getRequestDispatcher("/servlet/annoMapping.jsp").forward(request, response);
	}
}
