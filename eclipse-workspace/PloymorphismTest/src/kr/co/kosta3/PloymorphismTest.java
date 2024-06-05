package kr.co.kosta3;

class A {}
class B extends A {} 
class C extends B {}
class D extends B {}

public class PloymorphismTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		A a1 = new B();
		A a2 = new C();
		A a3 = new D();
		
		B b1 = new C();
		B b2 = new D();
	}
}






