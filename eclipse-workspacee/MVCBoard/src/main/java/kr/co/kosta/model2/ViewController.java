package kr.co.kosta.model2;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mvcboard/view.do")
public class ViewController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		MVCBoardDAO dao = new MVCBoardDAO();
		String idx = request.getParameter("idx");
		//조회수 1증가
		dao.updateVisitCount(idx);
		
		MVCBoardDTO dto = dao.selectView(idx);
		dao.close();
		
		//줄바꿈처리
		dto.setContent(dto.getContent().replaceAll("\r\n", "<br/>"));
		
		//첨부파일 확장자 확인 및 이미지 타입 표시
		String ext = null;
		String fileName = dto.getSfile();
		if(fileName != null)
			ext = fileName.substring(fileName.lastIndexOf(".")+1);
		String[] mimetype = {"jpg", "png", "gif"};
		List<String> mimetypeList = Arrays.asList(mimetype);
		
		boolean isImage = false;
		if(mimetypeList.contains(ext))
			isImage = true;
		
		request.setAttribute("dto", dto);
		request.setAttribute("isImage", isImage);
		request.getRequestDispatcher("/board/view.jsp").forward(request, response);
	}
	
}




