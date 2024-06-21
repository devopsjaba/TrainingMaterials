package kr.co.kosta3;

interface PrintString {
	void showString(String str);
}

public class LambdaTest {
	public static void main(String[] args) {
		// 람다식을 인터페이스 형 (참조)변수에 대입
		PrintString lamdaStr = s -> System.out.println(s);
		lamdaStr.showString("Hello Kosta!");
		showMyString(lamdaStr);
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Hello Kosta2!");
	}
	
	public static PrintString returnString() {
//		PrintString str = s -> System.out.println(s);
//		return str;
		
		return s -> System.out.println(s + "Kosta!!!");
	}
}
