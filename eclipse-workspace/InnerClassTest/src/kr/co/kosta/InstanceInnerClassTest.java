package kr.co.kosta;

class A {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	void abc() {
		System.out.println("A 클래스 메서드 abc()");
	}
	
	//인스턴스 이너 클래스
	class B {
		void bcd() {
			//아웃 클래스의 모든 멤버를 접근(사용) 가능
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			abc();
		}
	}
}

public class InstanceInnerClassTest {
	public static void main(String[] args) {
		// 아웃터 클래스 객체 생성
		A a = new A();
		// 이너 클래스 객체 생성
		A.B b = a.new B();
		b.bcd();
	}
}















