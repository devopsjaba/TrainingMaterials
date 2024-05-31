package kr.co.kosta;

public class WhileTest5 {
	public static void main(String[] args) {
		int a;
		//while
		a = 0;
		// 조건식이 처음부터 false가 나오는 경우
		while(a < 0) {
			System.out.print(a + " ");		// 0회 실행
			a++;
		}
		System.out.println();
		
		//do-while
		a = 0;
		do {
			System.out.print(a + " ");		// 1회 실행
			a++;
		} while(a < 0);
	}
}
