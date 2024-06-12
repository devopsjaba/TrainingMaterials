package kr.co.review.pack6;

class A {
	int a;
	static int b;
	static {
		b = 5;	//정적 필드의 초기화
		System.out.println("클래스 A가 로딩했습니다.");
	}
	A() {
		a = 3;	//인스턴스 필드 초기화
	}
}

public class StaticInitBlockTest {
	public static void main(String[] args) {
		System.out.println(A.b);
	}

}
