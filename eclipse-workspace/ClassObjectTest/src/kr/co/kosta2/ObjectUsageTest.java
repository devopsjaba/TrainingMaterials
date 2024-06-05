package kr.co.kosta2;

class A {
	int mField = 3;
	public void print() {
		System.out.println("객체 생성 및 활용");
	}
}


public class ObjectUsageTest {
	public static void main(String[] args) {
		A a = new A();
		a.mField = 5;
		System.out.println(a.mField);
		a.print();
	}
}
