package kr.co.kosta12;

import java.util.ArrayList;

public class Student {
	// Student 클래스 멤버 변수
	int studentId;
	String name;
	ArrayList<Subject> subjectList;
	
	public Student(int studentId, String name) {
		//super();
		this.studentId = studentId;
		this.name = name;
		subjectList = new ArrayList<>();
	}
	
	// 학생이 수강하는 과목을 arrayList 배열에 하나씩 추가하는 메서드 
	public void addSubject(String name, int score) {
		Subject subject = new Subject();		// 과목 생성하기
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	
	public void showInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();		//총점 더하기
			System.out.println("학생 " +name+ "의" + s.getName() +"과목 성적은"+ s.getScorePoint()
								+ " 입니다.");
		}
		System.out.println("학생 " +name+ "의 총점은 " +total+ " 입니다.");
	}
	
	
}






