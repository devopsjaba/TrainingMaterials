package kr.co.kosta;

class Car {}
/*
 * toString() 메서드 재정의하기 
 * 	- 학생의 이름, 학번이 출력되도록 구현하기 
 */
public class Student /* extends Object */ {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		//super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentId +", "+ studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId) //재정의한 equals() 메서드는 학생의 학번이 같으면 true 반환
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override 
	public int hashCode() {
		return studentId; // 해시 코드 값으로 학번을 리터하도록 메서드 재정의
	}
}








