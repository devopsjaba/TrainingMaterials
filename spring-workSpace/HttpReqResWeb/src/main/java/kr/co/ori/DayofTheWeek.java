package kr.co.ori;

import java.util.Calendar;

//년월일 입력하면 해당 요일 알려주는 프로그램 
public class DayofTheWeek {

	public static void main(String[] args) {
		
		//1.  입력
		String year = args[0];
		String month = args[1];
		String day = args[2];
		
		//2. 문자를 숫자로 변경
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm-1, dd); 		//month는 0부터 시작함 
		
		int dayofWeek = cal.get(Calendar.DAY_OF_WEEK);			//요일 리턴 (sunday = 1, .....)
		
		char dayofTheWeek = " 일월화수목금토".charAt(dayofWeek);     //  " 일월화수목금토".charAt(1) => 일
		
		//3. 출력
		System.out.println(year +"년 "+ month+ "월 "+ day+ "일은 ");
		System.out.println(dayofTheWeek +"요일입니다. ");
		
	}
}





