package kr.co.kosta2;

//자바 메서드로 진법 변환하기
public class BitwiseMethod {
	public static void main(String[] args) {
		int data = 13;										// 10진수 값
		System.out.println(Integer.toBinaryString(data));	// 2진수 값으로 변환
		System.out.println(Integer.toOctalString(data)); 	// 8진수 값으로 변환
		System.out.println(Integer.toHexString(data)); 		// 16진수 값으로 변환
		System.out.println();
		
		System.out.println(Integer.parseInt("1101", 2));	// 2진수 값을 10진수로 변환
		System.out.println(Integer.parseInt("15", 8));		// 8진수 값을 8진수로 변환
		System.out.println(Integer.parseInt("0D", 16));		// 16진수 값을 16진수로 변환
	}
}
