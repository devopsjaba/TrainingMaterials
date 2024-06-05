package kr.co.kosta;

public class Dog extends Mammal {

	private String breed;

	public Dog(String name, int age, boolean hasfur, String breed) {
		super(name, age, hasfur);    // 부모클래스의 생성자를 호출 
		this.breed = breed;
	}
	
	public void bark() {
		System.out.println(name + " 짖는다.");
	}
	
}
