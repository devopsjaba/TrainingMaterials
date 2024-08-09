package kr.co.kosta.model2;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.co.kosta.common.FileUtil;
import kr.co.kosta.util.JSFunction;

@WebServlet("/mvcboard/pass.do")
public class PassController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setAttribute("mode", request.getParameter("mode"));
		request.getRequestDispatcher("/board/pass.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String idx = request.getParameter("idx");
		String mode = request.getParameter("mode");
		String pass = request.getParameter("pass");
		
		MVCBoardDAO dao = new MVCBoardDAO();
		boolean confirmed = dao.confirmPassword(pass, idx);
		dao.close();
		
		if (confirmed) {
			if(mode.equals("edit")) { // 수정모드
				HttpSession session = request.getSession();
				session.setAttribute("pass", pass);
				response.sendRedirect("../mvcboard/edit.do?idx=" + idx);
				
			} else if (mode.equals("delete")) {			// 삭제모드
				dao = new MVCBoardDAO();
				MVCBoardDTO dto = dao.selectView(idx);
				int result = dao.deletePost(idx);		// 게시물 삭제
				dao.close();
				
				if(result == 1) {
					String saveFileName = dto.getSfile();
					FileUtil.deleteFile(request, "/Uploads", saveFileName);
				}
				
				JSFunction.alertLocation(response, "삭제되었습니다.", "../mvcboard/list.do");
				
			}
		} else {
			JSFunction.alertBack(response, "비밀번호 검증에 실패했습니다.");
		}
		
		
	}
}



















