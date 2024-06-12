package kr.co.review.pack2;

import kr.co.review.pack1.A;

public class C {
	public void print() {
		A a = new A();
		
		//멤버 활용
		System.out.print(a.a + " ");
		// 다른 패키지 내의 클래스에서는 자식 클래스가 아닐 때는 public 접근 지정자만 사용 가능
		System.out.println();
	}
}
