package kr.co.kosta.common;

public class PersonDTO {
	private String name;
	private int age;
	
	public PersonDTO() {
		//super();
	}

	public PersonDTO(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
