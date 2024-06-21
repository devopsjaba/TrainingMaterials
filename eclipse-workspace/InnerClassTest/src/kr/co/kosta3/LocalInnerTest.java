package kr.co.kosta3;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;						// 지역변수
		
		class MyRunnable implements Runnable {		// 지역 내부 클래스
			int localNum = 10;						// 지역 내부 클래스의 인스턴스 변수 	
			
			@Override
			public void run() {
				//i = 10;		// 매개변수는 상수로 바뀌므로 값을 변경할수 없음
				//num = 11;		// 지역변수는 상수로 바뀌므로 값을 변경할수 없음
				System.out.println("매개변수 : " + i);
				System.out.println("지역변수 : " + num);
				System.out.println("지역 내부 클래스의 인스턴스 변수 : " + localNum);
				System.out.println("외부 클래스 인스턴스 변수 : " + outNum);
				System.out.println("외부 클래스 정적 변수 : " + sNum);
			}
			
		}
		
		return new MyRunnable();
	}
}

public class LocalInnerTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runner = outer.getRunnable(10);			// 메서드 호출
		runner.run();
	}
}






