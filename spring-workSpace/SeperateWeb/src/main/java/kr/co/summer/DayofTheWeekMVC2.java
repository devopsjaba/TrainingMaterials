package kr.co.summer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//년월일 입력하면 해당 요일 알려주는 프로그램 
@Controller								// 1. 원격 호출가능한 프로그램으로 등록 			
public class DayofTheWeekMVC2 {

	@RequestMapping("/getdayoftheweekmvc")		// 2. URL과 메서드를 연결 
	public  ModelAndView kosta(int year, int month, int day) {
		
		//1. ModelAndView 생성
		ModelAndView mv = new ModelAndView();
		
		// 유효성 검사
		if (!isValid(year, month, day))
			return mv;
		
		//2. 처리
		char dayofTheWeek = getDayOfWeek(year, month, day);
		
		// 3. ModelAndView에 작업한 결과를 저장 
		mv.addObject("year", year);
		mv.addObject("month", month);
		mv.addObject("day", day);
		mv.addObject("dayofTheWeek", dayofTheWeek);
		
		//4. 작업 결과를 보여줄 View의 이름을 지정 
		mv.setViewName("dayofweek");
		
		// 5. ModelAndView를 반환 
		return mv;
		
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





