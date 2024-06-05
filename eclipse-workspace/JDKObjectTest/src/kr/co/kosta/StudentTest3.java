package kr.co.kosta;

public class StudentTest3 {
	public static void main(String[] args) {
		Student studentK = new Student(100, "Kim");
		Student studentL = studentK;
		
		Student studentShin = new Student(100, "Kim");
		System.out.println(studentK == studentShin);
		System.out.println(studentK.equals(studentShin));
		
		System.out.println("studentK의 hashCode : " + studentK.hashCode());
		System.out.println("studentShin의 hashCode : " + studentShin.hashCode());
	}
}
