package kr.co.kosta11;

import java.util.ArrayList;

/*
 * Student 클래스를 이용하여 ArrayList 객체를 만들고
 * 여기에 학생 3명을 추가하고 그 정보를 출력하시오.
 * 
 *  출력예시) 1001, 홍길동
 *  		1002, 신사임당
 *  		1003, 이순신
 */
public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1001, "홍길동"));
		students.add(new Student(1002, "신사임당"));
		students.add(new Student(1003, "이순신"));
		
		for(int i = 0; i < students.size(); i++)
			students.get(i).showInfo();
	}
}









