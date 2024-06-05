package kr.co.kosta4;
/*
 * 	이순신과 신사임당은 각각 버스와 지하철을 타고 KOSTA협회에 갑니다.
 *  이순신은 5000원을 가지고 있었고, 8100번 버스를 타면서 1700원을 지불합니다.
 *  신사임당은 10000원을 가지고 있었고, 신분당선 지하철을 타면서 2500원을 지불합니다.
 */
public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		//super();
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1700);
		this.money -= 1700; 
	}
	
	public void takeSubway(Subway subway) {
		subway.take(2500);
		this.money -= 2500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " +money+ "원 입니다.");
	}
	
}
