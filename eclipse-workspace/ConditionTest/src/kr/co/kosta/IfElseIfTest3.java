package kr.co.kosta;

public class IfElseIfTest3 {
	public static void main(String[] args) {
		// 90이상 : A, 80 이상 ~ 90 미만 : B, 70 이상 ~ 80 미만 : C, 70 미만 : F
		
		int a = 85;
		if(a >= 70 && a < 80) {			
			System.out.println("C학점");
		}
		else if(a >= 80 && a < 90) {		// 조건식이 참인 블록을 실행한 후 if문 탈출 
			System.out.println("B학점");
		}
		else if(a >= 90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점");
		}
	}
}
