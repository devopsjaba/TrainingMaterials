package kr.co.kosta11;

public class Student {
	int studentId;
	String name;
	
	public Student(int studentId, String name) {
		//super();
		this.studentId = studentId;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(studentId +", "+ name);
	}
	
	
}
