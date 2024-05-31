package kr.co.kosta2;

public class MydateTest {
	public static void main(String[] args) {
		Mydate date = new Mydate(28, 5, 2024);
		System.out.println(date.isValid());
		
		Mydate date2 = new Mydate(32, 5, 2024);
		System.out.println(date2.isValid());
		
		Mydate date3 = new Mydate(29, 2, 2024);
		System.out.println(date3.isValid());
		
	}
}
