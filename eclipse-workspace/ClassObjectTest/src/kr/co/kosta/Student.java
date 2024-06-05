package kr.co.kosta;

public class Student {
	int studentID;				// (멤버변수)
	String studentName;			// (멤버변수)
	int grade;					// (멤버변수)
	String address;				// (멤버변수)
	
	public void showStudentInfo() {				// 메서드 
		System.out.println(studentName +", "+ address);
	}
}
