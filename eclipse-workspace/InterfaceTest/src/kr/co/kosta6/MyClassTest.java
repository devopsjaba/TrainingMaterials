package kr.co.kosta6;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		//상위 인터페이스 X형으로 대입하면 X에 선언한 메서드만 호출 가능
		X xClass = myClass;
		xClass.x();
		
		//상위 인터페이스 Y형으로 대입하면 Y에 선언한 메서드만 호출 가능
		Y yClass = myClass;
		yClass.y();
		
		//인터페이스가 상속한 모든 메서드 호출 가능 
		MyInterface iClass = myClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}
}
