package kr.co.kosta2;

public class IfLab {
	public static void main(String[] args) {
		int age = 66;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		} 
		else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");			
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("중,고등학생입니다.");			
		}
		else if(age >= 65) {
			charge = 0;
			System.out.println("경로우대입니다.");					
		}
		else {
			charge = 3000;
			System.out.println("일반입입니다.");			
		}
		System.out.println("입장료는 " + charge + "원입니다.");
	}
}















