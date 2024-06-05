package kr.co.kosta;

public class Animal {
	protected String name;
	protected int age;
	//public Animal() {}
	public Animal(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println(name + " 먹는다.");
	}
	
	public void sleep() {
		System.out.println(name + " 잔다.");
	}
	
}
