package kr.co.kosta.school;

import java.util.ArrayList;

public class Subject {
	private int subjectId;			//과목 고유번호
	private String subjectName;
	private int gradeType;			//학점 부여 방식(정책)
	private ArrayList<Student> students = new ArrayList<>();	//과목 수강 신청한 학생들
	public Subject(int subjectId, String subjectName) {
		//super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getGradeType() {
		return gradeType;
	}
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public void register(Student student) {	//수강신청
		students.add(student);
	}
	
}
