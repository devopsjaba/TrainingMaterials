package kr.co.kosta2;

public class Student {
	int studentID;				
	String studentName;			
	int grade;					
	String address;				
	
	// 학생이름을 반환하는 메서드 -- 가져오는(get) 기능
	public String getStudentName() {
		return studentName;
	}
	
	// 학생이름을 매개변수로 전달 -- 값을 지정하는(set) 기능
	public void setStudentName(String name) {
		studentName = name;
	}
}
