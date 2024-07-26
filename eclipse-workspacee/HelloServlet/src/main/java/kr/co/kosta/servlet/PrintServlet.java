package kr.co.kosta.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PrintServlet() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>서블릿 출력하기</title></head>");
		writer.println("<body>");
		writer.println("<h2>서블릿에서 직접 뷰 화면을 출력합니다(웹문서 생성)</h2>");
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}

}
