package kr.co.kosta.school;

import java.util.ArrayList;

public class School {
	private static School instance = new School();
	private School() {}
	
	public static School getInstance() {
		if(instance == null)
			instance = new School();
		return instance;
	}
	
	private ArrayList<Student> students = new ArrayList<>();
	private ArrayList<Subject> subjects = new ArrayList<>();
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}
	
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
}
