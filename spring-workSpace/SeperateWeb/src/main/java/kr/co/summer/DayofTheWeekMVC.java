package kr.co.summer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//년월일 입력하면 해당 요일 알려주는 프로그램 
@Controller								// 1. 원격 호출가능한 프로그램으로 등록 			
public class DayofTheWeekMVC {

	@RequestMapping("/getdayoftheweek")		// 2. URL과 메서드를 연결 
	public  String kosta(int year, int month, int day, Model model) {
		
		//1.  입력
//		String year = request.getParameter("year");
//		String month = request.getParameter("month");
//		String day = request.getParameter("day");
		
		//2. 문자를 숫자로 변경
//		int yyyy = Integer.parseInt(year);
//		int mm = Integer.parseInt(month);
//		int dd = Integer.parseInt(day);
		
		// 유효성 검사
		if (!isValid(year, month, day))
			return "dayofweekerror";
		
		
		char dayofTheWeek = getDayOfWeek(year, month, day);
		
		// Model에 작업 결과 저장 
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("day", day);
		model.addAttribute("dayofTheWeek", dayofTheWeek);
		
		return "dayofweek";
		
	}

	private boolean isValid(int year, int month, int day) {
		if (year == -1 || month ==-1 || day == -1)
			return false;
		
		return (1 < month && month <=12) && (1 <= day && day <= 31);
	}

	//요일 산정 
	private char getDayOfWeek(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day); 		//month는 0부터 시작함 (날짜 설정)
		
		int dayofWeek = cal.get(Calendar.DAY_OF_WEEK);			//요일 리턴 (sunday = 1, .....)
		
		char dayofTheWeek = " 일월화수목금토".charAt(dayofWeek);     //  " 일월화수목금토".charAt(1) => 일
		return dayofTheWeek;
	}
	
	
}





