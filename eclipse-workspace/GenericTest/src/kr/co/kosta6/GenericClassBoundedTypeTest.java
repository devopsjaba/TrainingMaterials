package kr.co.kosta6;

class A {}
class B extends A {}
class C extends B {}

class D<T extends B> {			// B와 C만 올 수 있음
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class GenericClassBoundedTypeTest {
	public static void main(String[] args) {
		D<B> d1 = new D<>();
		D<C> d2 = new D<>();
		//D<A> d3 = new D<>();		// 불가능
		
		d1.setT(new B());
		d1.setT(new C());
		
		d2.setT(new C());
		//d2.setT(new B());			// d2 객체는 객체 생성할때 제네릭 타입으로 C를 지정하므로 B객체는 입력 불가능 
	}
}
