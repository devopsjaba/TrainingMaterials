package kr.co.kosta.ui;

import kr.co.kosta.school.School;
import kr.co.kosta.school.Score;
import kr.co.kosta.school.Student;
import kr.co.kosta.school.Subject;
import kr.co.kosta.school.view.GenerateGradeDisplay;
import kr.co.kosta.utils.Constant;

/*
 * 	인터페이스 활용한 프로그램 
 * 
 * 	1. 요구사항 
 * 		- Kosta 학교가 있습니다.
 * 				---
 * 		  이 학교에는 5명의 학생들이 수업을 듣습니다.
 * 						---
 * 		  과목은 국어와 수학이 있고, 각 학생은 두 과목을 모두 수강합니다.
 * 		  ---
 * 		  전공은 국어교육학과와 컴퓨터공학 두가지 있습니다.
 * 		  국어교육학과는 국어가 필수과목이고, 컴퓨터공학은 수학이 필수과목입니다.
 * 			
 * 		  이번 학기에 성적이 아래와 같이 나왔습니다.
 * 		  
 * 		  -------------------------------------------------------------------------
 * 			이름			학번			전공			필수과목			국어점수		수학점수	
 * 		  -------------------------------------------------------------------------
 * 			스티브잡스		20240626	국어교육학과	국어				95			 56
 * 			이순신		20240627	컴퓨터공학		수학				94			 98
 * 			리누스토발즈	20240628	국어교육학과	국어				100			 88
 * 			제임스고슬링	20240629	국어교육학과	국어				89			 94
 * 			이도			20240630	컴퓨터공학		수학				83			 56
 * 
 * 		   학점을 부여하는 방법은 여러가지 있습니다.
 * 		   단순히 A ~ F를 부여하는 방법, S ~ F를 부여하는 방법이 있습니다.
 * 		   일반과목이라면 A ~ F로, 필수과목이라면 S ~ F로 분류합니다.
 * 			
 * 		   일반과목 학점
 * 			A		B		C		D		F
 * 			--------------------------------------------
 * 			90~100	80~89	70~79	55~69	55미만
 * 	 								
 * 		   필수과목 학점
 * 			S		A		B		C		D		F
 * 			--------------------------------------------
 * 			95~100	90~94	80~89	70~79	60~69	60미만 			
 * 		
 * 
 * 			
 * 			학점 결과를 아래와 같이 나올수 있도록 구현하시오.
 * 			---
 * 
 * 			국어과목 학점 결과 >>>
 * 		  ======================================================
 * 			이름			학번			필수			점수		학점	
 * 		  ------------------------------------------------------ 
 * 			스티브잡스		20240626	국어			95		 S	
 * 			이순신		20240627	수학			94		 A 	 
 * 			리누스토발즈	20240628	국어			100		 S	 
 * 			제임스고슬링	20240629	국어			89		 B	 
 * 			이도			20240630	수학			83		 B	  
 *        ------------------------------------------------------
 * 
 * 			수학과목 학점 결과 >>>
 * 		  ======================================================
 * 			이름			학번			필수			점수		학점	
 * 		  ------------------------------------------------------ 
 * 			스티브잡스		20240626	국어			56		 D	
 * 			이순신		20240627	수학			98		 S 	 
 * 			리누스토발즈	20240628	국어			88		 B	 
 * 			제임스고슬링	20240629	국어			94		 A	 
 * 			이도			20240630	수학			56		 F	   
 * 		  ------------------------------------------------------	
 * 
 * 			학점 정책이 추가되는 경우를 고려해서 클래스를 설계하고 인터페이스 선언해서
 * 			각 정책이 해당 인터페이스를 구현하도록 합니다.
 * 
 * 	2. 클래스 정의 (관계, UML)
 * 	3. 구현
 * 	4. 테스트 
 *  5. 유지보수(업그레이드)
 *		1) 과목과 학점 정책 추가
 *			- 골프 과목이 새로 개설되고, 이 과목의 평가 정책은 pass / fail로 정해졌습니다.
 *			- 70점 이상인 경우는 pass, 미만인 겨우는 fail입니다.
 *			- 전체 5명  학생중 3명만 이 과목에 수강신청 했습니다.
 		2) 학점 결과를 아래와 같이 나올 수 있도록 구현하시오.
 		
 * 			골프과목 학점 결과 >>>
 * 		  ======================================================
 * 			이름			학번			필수			점수		학점	
 * 		  ------------------------------------------------------ 
 * 			스티브잡스		20240626	국어			95		 P	
 * 			이순신		20240627	수학			85		 P 	 
 * 			리누스토발즈	20240628	국어			55		 F	   
 * 		  ------------------------------------------------------ 			
 * 			
 * 
 * 	* Builder Pattern
 * 		1) 메서드의 조합으로 결과물을 생성하는 방법 
 * 			- 생성에 대한 과정과 각 결과물을 표현하는 방법을 분리하여 
 * 			  동일한 생성 과정에 서로 다른 여러 결과물이 나올수 있도록 함 
 * 			- 클라이언트 코드는 Builder가 제공하는 메서드를 기반으로 원하는
 *            결과물을 얻을 수 있음.	
 *          - 새로운 결과물이 필요한 경우에도 동일한 과정으로 생성 할수 있음   	
 * 	
 */
public class UiMain {
	
	School kSchool = School.getInstance();
	Subject korean;
	Subject math;

	GenerateGradeDisplay gradeDisplay = new GenerateGradeDisplay();
	
	public static void main(String[] args) {
		UiMain uiMain = new UiMain();
		
		//시험 과목 생성
		uiMain.createSubject();
		//시험 학생 생성
		uiMain.createStudent();
		
		String display = uiMain.gradeDisplay.getDisplay();
		System.out.println(display);
	}

	public void createStudent() {
		Student student1 = new Student("스티브잡스", 20240626, korean);
		Student student2 = new Student("이순신", 20240627, math);
		Student student3 = new Student("리누스토발즈", 20240628, korean);
		Student student4 = new Student("제임스고슬링", 20240629, korean);
		Student student5 = new Student("이도", 20240630, math);
		
		kSchool.addStudent(student1);
		kSchool.addStudent(student2);
		kSchool.addStudent(student3);
		kSchool.addStudent(student4);
		kSchool.addStudent(student5);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		//과목별 성적 입력
		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 56);
		
		addScoreForStudent(student2, korean, 94);
		addScoreForStudent(student2, math, 98);
		
		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student3, math, 88);
		
		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student4, math, 94);
		
		addScoreForStudent(student5, korean, 83);
		addScoreForStudent(student5, math, 56);
		
		
	}

	private void addScoreForStudent(Student student, Subject subject, int score) {
		Score score1 = new Score(student.getStudentId(), subject, score);
		student.addSubjectScore(score1);
	}

	public void createSubject() {
		korean = new Subject(Constant.KOREAN, "국어");
		math = new Subject(Constant.MATH, "수학");
		
		kSchool.addSubject(korean);
		kSchool.addSubject(math);
	}
}










