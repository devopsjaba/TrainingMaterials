package kr.co.kosta;

public class MethodTest {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 +" + "+ num2 +" = "+ sum + "입니다.");
		
		int result = substract(num1, num2);
		System.out.println(num1 +" - "+ num2 +" = "+ result + "입니다.");
		
		result = times(num1, num2);
		System.out.println(num1 +" * "+ num2 +" = "+ result + "입니다.");
		
		result = divide(num1, num2);
		System.out.println(num1 +" / "+ num2 +" = "+ result + "입니다.");		
	}

	public static int divide(int num1, int num2) {
		return num1 / num2;
	}

	public static int times(int num1, int num2) {
		return num1 * num2;
	}

	public static int substract(int num1, int num2) {
		return num1 - num2;
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// 사칙연산 나머지 3개 구현하고 결과값을 출력하시오 
}
