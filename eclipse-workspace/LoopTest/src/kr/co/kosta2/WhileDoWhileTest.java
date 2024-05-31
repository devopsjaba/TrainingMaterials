package kr.co.kosta2;

public class WhileDoWhileTest {
	public static void main(String[] args) {
		// 1회 이상 반복되는 경우
		int a;
		// while
		a = 0;
		while(a < 10) {
			System.out.print(a + " ");		// 0, 1, 2,...9: 10회 실행
			a++;
		}
		System.out.println();
		
		//do-while
		a = 0;
		do {
			System.out.print(a + " ");		// 0, 1, 2,...9: 10회 실행
			a++;
		} while(a < 10);
	}
}























