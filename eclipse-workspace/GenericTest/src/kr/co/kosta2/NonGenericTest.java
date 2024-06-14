package kr.co.kosta2;

class Apple {}

class Goods1 {		// Apple 클래스를 담을수(저장) 있는 클래스 
	private Apple apple = new Apple();

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}	
}

class Pencil {}

class Goods2 {		// Pencil 클래스를 담을 수 있는 클래스 
	
	private Pencil pencil = new Pencil();

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
}


public class NonGenericTest {
	public static void main(String[] args) {
		// Good1을 이용해 Apple 객체를 추가하거나 가져오기 
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple()); 			// Apple 타입만 입력 가능
		Apple apple = goods1.getApple();		// Applie 타입 리턴
		
		// Good2을 이용해 Pencil 객체를 추가하거나 가져오기 
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil());  		// Pencil 타입만 입력 가능
		Pencil pencil = goods2.getPencil();		// Pencil 타입 리턴 
	}
}









