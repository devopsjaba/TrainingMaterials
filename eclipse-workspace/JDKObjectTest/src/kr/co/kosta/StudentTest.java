package kr.co.kosta;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student(10001, "홍길동");
		System.out.println(student);
		
		Student student2 = student;		// 주소 복사 
		Student student3 = new Student(10001, "홍길동");
		
		if (student == student2)
			System.out.println("student와 student2의 주소는 같습니다.");
		else 
			System.out.println("student와 student2의 주소는 다릅니다.");
		
		if(student.equals(student2))
			System.out.println("student와 student2는 동일합니다.");
		else
			System.out.println("student와 student2는 동일하지 않습니다.");
		
		System.out.println();
		if (student == student3)
			System.out.println("student와 student3의 주소는 같습니다.");
		else 
			System.out.println("student와 student3의 주소는 다릅니다.");
		
		if(student.equals(student3))
			System.out.println("student와 student3는 동일합니다.");
		else
			System.out.println("student와 student3는 동일하지 않습니다.");		
		
	}
}
