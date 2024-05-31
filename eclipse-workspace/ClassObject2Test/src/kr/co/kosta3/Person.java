package kr.co.kosta3;

public class Person {
	String name;
	int age;
	
	public Person() {
		this("홍길동", 10);
	}

	public Person(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.name +"의 나이는 "+ p.age +"살 입니다.");
		
		p.name = "신사임당";
		p.age = 20;
		Person p2 = p.getPerson();
		System.out.println(p);
		System.out.println(p2);
	}
}
