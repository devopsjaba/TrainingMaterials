package kr.co.kosta.school;

import java.util.ArrayList;

public class Student {
	private String studentName;
	private int studentId;
	private Subject majorSubject;
	private ArrayList<Score> scores = new ArrayList<>();	//성적리스트
	public Student(String studentName, int studentId, Subject majorSubject) {
		//super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.majorSubject = majorSubject;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public ArrayList<Score> getScores() {
		return scores;
	}
	public void setScores(ArrayList<Score> scores) {
		this.scores = scores;
	}
	
	public Subject getMajorSubject() {
		return majorSubject;
	}
	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}
	public void addSubjectScore(Score score) {
		scores.add(score);
	}
	
}
