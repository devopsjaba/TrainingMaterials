package kr.co.kosta4;

public class Person {
	String name;
	float height;
	float weight;
	
	//디폴트 생성자 직접 추가
	public Person() {}
	
	// 사람 이름을 매개변수로 입력받아서 name의 값을 초기화 
	public Person(String pname) {
		name = pname;
	}
	
	// 이름, 키, 몸무게를 매개변수로 받는 생성자
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
