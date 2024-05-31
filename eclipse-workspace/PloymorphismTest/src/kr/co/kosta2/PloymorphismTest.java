package kr.co.kosta2;

class A {}
class B extends A {} 

public class PloymorphismTest {
	public static void main(String[] args) {
		A a1 = new A();		// A는 A이다.
		A a2 = new B();		// B는 A이다.		자식 클래스를 부모 클래스로 부를 때를 '업캐스팅'이라 함
	}
}
