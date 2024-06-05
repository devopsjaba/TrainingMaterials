package kr.co.kosta5;

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
		Student student1 = new Student("이순신", 20000);
		Taxi taxiKosta = new Taxi("코스타 운수");
		
		student1.take(taxiKosta);
		
		student1.showInfo();
		taxiKosta.showInfo();
		
		
	}
}
