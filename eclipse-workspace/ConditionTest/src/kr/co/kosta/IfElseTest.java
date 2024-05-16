package kr.co.kosta;

public class IfElseTest {
	public static void main(String[] args) {
		if(5 > 3) {
			System.out.println("실행1");
		} else {
			System.out.println("실행2");
		}
		
		int a,b;
		a = 5; b = 0;
		if(a > 5) {
			b = 10;
		} else {
			b = 20;
		}
		
		System.out.println(b);
		
		// 삼항 연산자로 변환 
		a = 5; b = 0;
		b = (a > 5) ? 10 : 20; 
		System.out.println(b);
	}
}
