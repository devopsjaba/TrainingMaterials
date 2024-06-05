package kr.co.kosta12;

public class StudentTest {
	public static void main(String[] args) {
		Student studenthong = new Student(1001, "홍길동");
		studenthong.addSubject("국어", 100);
		studenthong.addSubject("수학", 89);
		
		Student studentshin = new Student(1002, "신사임당");
		studentshin.addSubject("국어", 90);
		studentshin.addSubject("수학", 95);
		studentshin.addSubject("영어", 100);
		
		studenthong.showInfo();
		System.out.println();
		studentshin.showInfo();
	}
}
