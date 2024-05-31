package kr.co.kosta;

public class Mammal extends Animal {
	protected boolean hasfur;

	public Mammal(String name, int age, boolean hasfur) {
		super(name, age);	// 부모클래스의 생성자를 호출 
		this.hasfur = hasfur;
	}
	
	public void walk() {
		System.out.println(name + " 걷는다.");
	}
	
}
