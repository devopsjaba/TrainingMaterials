package kr.co.kosta.model2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.kosta.common.FileUtil;
import kr.co.kosta.util.JSFunction;

import java.io.IOException;


public class WriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.getRequestDispatcher("/board/write.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//1. 파일 업로드 처리
		//경로 확인
		String saveDirectory = request.getServletContext().getRealPath("/Uploads");
		
		String orginalFileName = "";
		
		try {
			orginalFileName = FileUtil.uploadFile(request, saveDirectory);
		} catch (Exception e) {
			JSFunction.alertLocation(response, "파일 업로드 오류입니다.", "../mvcboard/write.do");
			return;
		}
		
		//
		
	}

}











