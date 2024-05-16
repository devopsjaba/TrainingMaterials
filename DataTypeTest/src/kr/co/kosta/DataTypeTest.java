package kr.co.kosta;

public class DataTypeTest {
	public static void main(String[] args) {
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L;	// long 자료형으로 인식
		System.out.println(value4);
		System.out.println();
		
		float value5 = 1.2F;	// float 자료형으로 인식 
		double value6 = -1.5;
		double value7 = 5;		// 자동 타입 변환 
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7); 	// 실수값으로 출력 
	}
}





