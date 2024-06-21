package kr.co.kosta3;

class OutClass {					// 외부 클래스
	private int num = 10;			// 외부 클래스 private 변수
	private static int sNum = 20;	// 외부 클래스 정적 변수 
	
	private InClass inClass;		// 내부 클래스 자료형 변수를 먼저 선언 
	
	public OutClass() {
		inClass = new InClass();	// 외부 클래스 디폴트 생성자. 외부 클래스가 생성된 후에 
	}                               // 내부 클래스 생성 가능
	
	static class InStaticClass {	// 정적 내부 클래스 
		int inNum = 100;			// 정적 내부 클래스의 인스턴스 변수 
		static int sInNum = 200;	// 정적 내부 클래스의 정적 변수 
		
		void inTest() {				// 정적 내부 클래스의 일반 메서드		
			//System.out.println(num);		// 외부 클래스의 인스턴스 변수는 사용할 수 없음
			System.out.println("내부 클래스의 인스턴스 변수 : " + inNum);
			System.out.println("내부 클래스의 정적 변수 : " + sInNum);
			System.out.println("외부 클래스의 정적 변수 : " + sNum);
		}
		
		static void sTest() {		// 정적 내부 클래스의 정적 메서드 
			// System.out.println(num);			// 외부클래스의 인스턴스 변수는 사용할 수 없음
			// System.out.println(inNum);		// 내부 클래스의 인스턴스 변수는 사용할 수 없음 
			System.out.println("외부클래스의 정적 변수 : " + sNum);
			System.out.println("내부클래스의 정적 변수 : " + sInNum);
		}
	}
	
	
	class InClass {					// 인스턴스 내부 클래스 
		int inNum = 100;			// 내부 클래스의 인스턴스 변수 
		static int sInNum = 200;	// 내부 클래스의 정적 변수
		
		void inTest() {
			System.out.println("OutClass num(외부 클래스의 인스턴스 변수) = " + num);
			System.out.println("OutClass sNum(외부 클래스의 정적 변수) = " + sNum);
			System.out.println("InClass inNum(내부 클래스의 인스턴스 변수) = " + inNum);
		}
		static void sTest() {		// 내부 클래스의 정적 메서드 
			//System.out.println(inNum);
		}
	}
	
	public void usingOutClass() {
		inClass.inTest();
	}
	
}

public class InnerTest {
	public static void main(String[] args) {
//		OutClass outClass = new OutClass();
//		System.out.println("외부 클래스 이용하여 내부 클래스 메서드 호출");
//		outClass.usingOutClass(); 		// 내부 클래스 메서드 호출
		
		// 외부클래스를 생성하지 않고 바로 정적 내부 클래스 생성가능
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
	}
}





