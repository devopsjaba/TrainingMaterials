package kr.co.kosta3;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.age = 30;
		person.name = "홍길동";
		person.isGraduated = true;
		person.numberOfHouse = 2;
		
		System.out.println("나이 : " + person.age);
		System.out.println("이름 : " + person.name);
		System.out.println("졸업 여부 : " + person.isGraduated);
		System.out.println("집 수 : " + person.numberOfHouse);
	}
}
