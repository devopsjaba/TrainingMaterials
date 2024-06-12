package kr.co.review;

import kr.co.review.pack1.A;
import kr.co.review.pack1.B;
import kr.co.review.pack2.C;
import kr.co.review.pack2.D;

public class AccessModifierTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();
		b.print();
		c.print();
		d.print();
	}
}
