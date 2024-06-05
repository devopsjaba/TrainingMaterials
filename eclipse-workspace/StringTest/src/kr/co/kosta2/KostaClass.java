package kr.co.kosta2;

class Kosta {}

public class KostaClass {
	public static void main(String[] args) {
		System.out.println("Hello Java!");
		
		int a = 1;
		Integer aInt = a;		// Java 1.5 이상에서는 오토 박싱 (Auto-boxing)
		int b = aInt;				// 오토 언박싱(Auto-unboxing)
		
		// Java 1.5 미만에서는 수동 박싱, 언박싱 필요
		int c = 2;
		Integer cInt = new Integer(c);
		int d = cInt.intValue();
	}
}
