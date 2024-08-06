package kr.co.kosta.model2;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.co.kosta.common.FileUtil;
import kr.co.kosta.util.JSFunction;

@WebServlet("/mvcboard/edit.do")
@MultipartConfig(
		maxFileSize = 1048576,
		maxRequestSize =  10485760
)
public class EditController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String idx = request.getParameter("idx");
		MVCBoardDAO dao = new MVCBoardDAO();
		MVCBoardDTO dto = dao.selectView(idx);
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("/board/edit.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// 물리적 경로 확인
		String saveDirectory = request.getServletContext().getRealPath("/Uploads");
		
		// 파일 업로드 
		String orginalFileName = "";
		
		try {
			orginalFileName = FileUtil.uploadFile(request, saveDirectory);
		} catch (Exception e) {
			JSFunction.alertBack(response, "파일 업로드 오류입니다.");
			return;
		}
		
		// 수정 내용 반영
		String idx = request.getParameter("idx");
		String prevOfile = request.getParameter("prevOfile");
		String prevSfile = request.getParameter("prevSfile");
		
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		HttpSession session = request.getSession();
		String pass = (String)session.getAttribute("pass");
		
		// DTO 저장
		MVCBoardDTO dto = new MVCBoardDTO();
		dto.setIdx(idx);
		dto.setName(name);
		dto.setTitle(title);
		dto.setContent(content);
		dto.setPass(pass);
		
		// 원본 파일 이름과 저장되는 파일 이름 설정
		if (orginalFileName != "") {
			//파일명 변경
			String savedFileName = FileUtil.renameFile(saveDirectory, orginalFileName);
			
			dto.setOfile(orginalFileName);		//원 파일 이름
			dto.setSfile(savedFileName);		//서버에 저장된 파일 이름	
			
			//기존 파일 삭제
			FileUtil.deleteFile(request, "/Uploads", prevSfile);
		}
		else {
			//첨부파일이 없으면 기존 이름 유지 
			dto.setOfile(prevOfile);
			dto.setSfile(prevSfile);
		}
		
		// DB 수정 내용 반영
		MVCBoardDAO dao = new MVCBoardDAO();
		int result = dao.updatePost(dto);
		dao.close();
		
		if(result == 1) {
			//수정 성공
			session.removeAttribute("pass");
			response.sendRedirect("../mvcboard/view.do?idx=" + idx);			
		}
		else {
			//수정 실패
			JSFunction.alertLocation(response, "비밀번호 검증을 다시 진행해주세요.", "../mvcboard/view.do?idx=" + idx);
		}
		
		
		
	}
}
















