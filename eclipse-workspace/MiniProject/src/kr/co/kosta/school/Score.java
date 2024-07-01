package kr.co.kosta.school;

public class Score {
	private int studentId;		//학번
	private Subject subject;	//과목
	private int score;			//점수
	public Score(int studentId, Subject subject, int score) {
		//super();
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	public int getStudentId() {
		return studentId;
	}
	public Subject getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	
	
	
}
