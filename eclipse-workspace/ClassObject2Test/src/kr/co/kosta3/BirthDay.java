package kr.co.kosta3;

public class BirthDay {

	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2025);
		System.out.println(bDay);
		bDay.printThis();
	}
}














