package kr.co.ori;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//년월일 입력하면 해당 요일 알려주는 프로그램 
@Controller								// 1. 원격 호출가능한 프로그램으로 등록 			
public class DayofTheWeek2 {

	@RequestMapping("/getdayoftheweek")		// 2. URL과 메서드를 연결 
	public  void kosta(HttpServletRequest request, HttpServletResponse response) {
		
		//1.  입력
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		
		//2. 문자를 숫자로 변경
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm-1, dd); 		//month는 0부터 시작함 (날짜 설정)
		
		int dayofWeek = cal.get(Calendar.DAY_OF_WEEK);			//요일 리턴 (sunday = 1, .....)
		
		char dayofTheWeek = " 일월화수목금토".charAt(dayofWeek);     //  " 일월화수목금토".charAt(1) => 일
		
		//3. 출력
		System.out.println(year +"년 "+ month+ "월 "+ day+ "일은 ");
		System.out.println(dayofTheWeek +"요일입니다. ");
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");			//한글 정상 출력되게 함 
		
		PrintWriter out;		
		try {
			out = response.getWriter();							//브라우저로의 출력 스트림 획득
			out.print("<html>");
			out.print("<head>");
			out.print("</head>");
			out.print("<body>");
			
			out.print(year +"년 "+ month+ "월 "+ day+ "일은 ");
			out.print(dayofTheWeek + "요일입니다. ");
			
			out.print("</body>");
			out.print("</html>");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}





