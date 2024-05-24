package kr.co.kosta2;

public class Operator2 {
	public static void main(String[] args) {
		int a1 = 3;
		int b1 = ++a1;		// a1값에 1을 더하기 => a1값을 b1 값에 대입 
		System.out.println(a1);
		System.out.println(b1);
		
		int a2 = 3;
		int b2 = a2++;		// a2값을 b2 값에 대입 => a2 값에 1을 더하기 
		System.out.println(a2);
		System.out.println(b2);		
	}
}
