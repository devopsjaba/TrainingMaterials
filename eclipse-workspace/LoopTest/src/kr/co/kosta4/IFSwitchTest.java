package kr.co.kosta4;

public class IFSwitchTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		char operator = '^';
		int result = 0;
		
		// if~ else if ~ else 문으로 사칙연산을 수행하는 프로그램을 하시오.
		if(operator == '+') {
			result = num1 + num2;
		} else if(operator == '-') {
			result = num1 - num2;
		} else if(operator == '*') {
			result = num1 * num2;
		} else if(operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println("연산자 오류입니다.");
			//return;			// 함수 수행을 끝내고 흐름 중에서 호출한 곳으로 다시 되돌아갈 때 사용함 
		}
		System.out.println("결과 값은 " +result+ "입니다.");
		System.out.println();
		// switch~case문으로 문으로 사칙연산을 수행하는 프로그램을 하시오.
		switch(operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;		
			default:
				System.out.println("연산자 오류입니다.");
				return;
		}
		System.out.println("결과 값은 " +result+ "입니다.");
		
		// 출력 예시) 결과 값은 OO 입니다.
	}
}
















