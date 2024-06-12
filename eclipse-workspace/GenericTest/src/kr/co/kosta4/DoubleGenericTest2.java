package kr.co.kosta4;


class Apple {}
class Pencil {}

class Goods<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class DoubleGenericTest2 {
	public static void main(String[] args) {
		// Goods를 이용해 Apple 객체를 추가하거나 가져오기
		Goods<Apple> goods1 = new Goods<>();
		goods1.setT(new Apple());
		Apple apple = goods1.getT(); //다운케스팅 필요 없음
		
		// Goods를 이용해 Pencil 객체를 추가하거나 가져오기
		Goods<Pencil> goods2 = new Goods<>();
		goods2.setT(new Pencil());
		Pencil pencil = goods2.getT();
		
		Goods<Apple> goods3 = new Goods<>();
		//goods3.setT(new Pencil()); // 강한 타입 체크로 문법 오류 발생
		goods3.setT(new Apple());
		//Pencil pencil2 = goods3.getT();
		
		Goods<Object> goods4 = new Goods<>();
	}
}












