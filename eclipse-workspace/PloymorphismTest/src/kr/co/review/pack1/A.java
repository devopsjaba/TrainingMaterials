package kr.co.review.pack1;

public class A {
	public int a = 1;
	protected int b = 2;
	int c = 3;
	private int d = 4;
	
	// 같은 클래스 내의 멤버를 print()  메서드 내부에서는 모든 접근 지정자에 접근 가능 
	public void print() {
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print(c + " ");
		System.out.print(d);
		System.out.println();
	}
	
}
