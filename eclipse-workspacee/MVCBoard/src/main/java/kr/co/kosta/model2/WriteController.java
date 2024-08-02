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
		
		//2. 파일 업로드 처리 외 
		// 값들을 DTO에 저장 
		MVCBoardDTO dto = new MVCBoardDTO();
		dto.setName(request.getParameter("name"));
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		dto.setPass(request.getParameter("pass"));
		
		// 원본 파일 이름과 저장되는 파일 이름 설정
		if (orginalFileName != "") {
			//파일명 변경
			String savedFileName = FileUtil.renameFile(saveDirectory, orginalFileName);
			
			dto.setOfile(orginalFileName);		//원 파일 이름
			dto.setSfile(savedFileName);		//서버에 저장된 파일 이름	
		}
			
		MVCBoardDAO dao = new MVCBoardDAO();
		int result = dao.insertWrite(dto);
		dao.close();
		
		if (result == 1) 
			response.sendRedirect("../mvcboard/list.do");
		else
			//글쓰기 실패
			JSFunction.alertLocation(response, "글쓰기 실패했습니다.", "../mvcboard/write.do");
		
	}

}











