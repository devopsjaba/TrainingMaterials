package kr.co.kosta4;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person("홍길동");
		System.out.println(person.name);
		
		Person person2 = new Person();
		person2.name = "신사임당";
		System.out.println(person2.name);
		
		Person person3 = new Person("신사임당", 172, 65);
	}
}
