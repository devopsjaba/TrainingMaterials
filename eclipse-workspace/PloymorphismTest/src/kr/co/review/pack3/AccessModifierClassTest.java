package kr.co.review.pack3;

public class AccessModifierClassTest {
	public static void main(String[] args) {
		//객체 생성
		/*
		 *  같은 패키지에서는 public 클래스와 default 클래스의 타입 모두 
		 *  객체를 선언할 수 있음.
		 *  public 생성자와 default 생성자 모두 호출 가능.
		 */
		A a = new A();
		B b = new B();
		C c = new C();
	}
}
