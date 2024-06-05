package kr.co.kosta;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("홍길동");
		System.out.println("학생 이름 : " + student.getStudentName());
	}
}
