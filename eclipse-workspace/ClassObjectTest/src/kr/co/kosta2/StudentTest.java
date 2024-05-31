package kr.co.kosta2;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student();		// 첫번째 Student 객체(인스턴스) 생성
		student1.studentName = "홍길동";
		student1.setStudentName("신사임당");
		System.out.println(student1.getStudentName());
		System.out.println(student1);		 	// 참조 변수 값 출력
		
		Student student2 = new Student();		// 두번째 Student 객체(인스턴스) 생성
		student2.setStudentName("홍길동2");
		System.out.println(student2.getStudentName());
		System.out.println(student2);
		
	}
}
