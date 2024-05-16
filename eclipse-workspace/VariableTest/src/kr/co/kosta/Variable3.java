package kr.co.kosta;

public class Variable3 {
	public static void main(String[] args) {
		byte bs1 = -128;
		//byte bs2 = 128;
		
		short sVal = 10;
		byte bVal = 20;
		// 자료형이 다른 정수끼리 연산
		System.out.println(sVal + bVal);
		
		//int num1 = 12345678900;
		long num2 = 12345678900L;	// long형으로 처리하라고 컴파일러에게 알려줌 
	}
}
