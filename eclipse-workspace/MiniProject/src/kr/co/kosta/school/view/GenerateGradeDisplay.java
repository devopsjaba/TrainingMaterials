package kr.co.kosta.school.view;

import java.net.Socket;
import java.util.ArrayList;

import kr.co.kosta.grade.BasicEvaluation;
import kr.co.kosta.grade.GradeEvaluation;
import kr.co.kosta.grade.MajorEvaluation;
import kr.co.kosta.grade.PassFailEvaluation;
import kr.co.kosta.school.School;
import kr.co.kosta.school.Score;
import kr.co.kosta.school.Student;
import kr.co.kosta.school.Subject;
import kr.co.kosta.utils.Constant;

public class GenerateGradeDisplay {
	
	School school = School.getInstance();

	public static final String TITLE = "과목 학점 결과 >>> \n";
	public static final String LINE = "---------------------------------------------------------------\n";
	public static final String HEADER = "이름	 \t 학번		필수 \t	점수		학점\n	";
	public static final String LINE2 = "==========================================================\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getDisplay() {
		ArrayList<Subject> subjects = school.getSubjects();
		
		for(Subject subject : subjects) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter(subject);
		}
		
		return buffer.toString();
	}

	private void makeFooter(Subject subject) {
		buffer.append("\n");
		
	}

	private void makeBody(Subject subject) {
		ArrayList<Student> students = subject.getStudents();
		for(int i=0; i < students.size(); i++) {
			Student student = students.get(i);
			buffer.append(student.getStudentName());
			if(student.getStudentName().length() >= 6) {
				buffer.append("\t");
			} else {
				buffer.append("\t\t");
			}
			buffer.append(student.getStudentId());
			buffer.append("\t");
			buffer.append(student.getMajorSubject().getSubjectName());
			buffer.append("\t");
			getScoreGrade(student, subject);	//학생별 해당과목 학점 계산
			buffer.append("\n");
			
		}
		
		buffer.append(GenerateGradeDisplay.LINE2);
		
	}

	private void getScoreGrade(Student student, Subject subject) {
		ArrayList<Score> scoreList = student.getScores();	
		int majorId = student.getMajorSubject().getSubjectId();
		
		// 학점 부여 클래스들
		GradeEvaluation[] gradeEvaluations = { new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation() };
		
		for(int i=0; i<scoreList.size(); i++) {		//학생이 가진 점수들
			Score score = scoreList.get(i);
			
			if(score.getSubject().getSubjectId() == subject.getSubjectId()) {	
				String grade;
				
				if(score.getSubject().getGradeType() == Constant.GOLF) {
					grade = gradeEvaluations[Constant.PF_TYPE].getGrade(score.getScore());
				}
				else {
					if(score.getSubject().getSubjectId() == majorId) 	//필수 과목인 경우
						grade = gradeEvaluations[Constant.SAF_TYPE].getGrade(score.getScore());		//필수과목 학점평가 적용
					else
						grade = gradeEvaluations[Constant.AF_TYPE].getGrade(score.getScore());		//일반과목 학점평가 적용					
				}
				
				buffer.append(score.getScore());
				buffer.append("\t");
				buffer.append(grade);
				buffer.append("\t");
			}
		}		
	}

	private void makeHeader(Subject subject) {
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeDisplay.TITLE);
		buffer.append(GenerateGradeDisplay.LINE);
		buffer.append(GenerateGradeDisplay.HEADER);
		buffer.append(GenerateGradeDisplay.LINE);
	}

}





