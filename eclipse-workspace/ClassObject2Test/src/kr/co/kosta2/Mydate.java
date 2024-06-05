package kr.co.kosta2;

import java.util.Calendar;

public class Mydate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	// 생성자 추가 (int, int, int)
	public Mydate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public void setDay(int day) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(day < 0 || day > 31) {
					isValid = false;
				}
				else {
					this.day = day;
				}
				break;
			case 4: case 6: case 9: case 11:
				if(day < 0 || day > 30) {
					isValid = false;
				}
				else {
					this.day = day;
				}
				break;	
			case 2:
				// 윤년인 경우
				if(((year % 4 ==0 && year % 100 !=0) || year % 400 == 0)) {
					if(day < 1 || day > 29) {
						isValid = false;
					} else {
						this.day  = day;
					}				
				}
				else {
					if(day < 1 || day > 28) {
						isValid = false;
					} else {
						this.day  = day;
					}						
				}
				break;
			default:
				isValid = false;
		}		
	}

	public void setMonth(int month) {
		if( month < 1 || month > 12) {
			isValid = false;
		}
		this.month = month;	
	}

	/*
	 * year값 현재 연도 이하인 경우에만 유효한 날짜로 간주
	 */
	public void setYear(int year) {
		int cYear = Calendar.getInstance().get(Calendar.YEAR);
		if (year  > cYear) {
			isValid = false;
		}
		else
			this.year = year;
	}
	
	public String isValid() {
		if(isValid) {
			return "유효한 날짜입니다.";
		}
		else {
			return "유효하지 않은 날짜입니다.";
		}
	}
	
	
}
