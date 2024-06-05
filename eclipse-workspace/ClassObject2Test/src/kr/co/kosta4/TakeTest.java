package kr.co.kosta4;

/*
 * 이성계는 지각을 해서 택시를 타야 했습니다.
 * 20000원을 가지고 있었는데 15000원을 택시비로 사용했습니다.
 * 택시는 '코스타 운수'회사 택시를 탔습니다.
 * 
 * 출력 예시) 이성계님의 남은 돈은 5000원 입니다.
 *          코스타 운수 택시 수입은 15000원 입니다. 
 */
public class TakeTest {
	public static void main(String[] args) {
		Student student1 = new Student("이순신", 5000);
		Student student2 = new Student("신사임당", 10000);
		
		Bus bus8100 = new Bus(8100);
		Subway subwayNewB = new Subway("신분당선");
		
		student1.takeBus(bus8100);
		student1.takeBus(bus8100);
		student2.takeSubway(subwayNewB);
		student2.takeSubway(subwayNewB);
		
		student1.showInfo();
		student2.showInfo();
		bus8100.showInfo();
		subwayNewB.showInfo();
		
	}
}
