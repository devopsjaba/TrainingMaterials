package kr.co.kosta2;

public class TypeCasting2 {
	public static void main(String[] args) {
		// 자동 타입 변환
		float value1 = 3;			// int => float (업캐스팅)
		long value2 = 5;			// int => long (업캐스팅)
		double value3 = 7;			// int => double (업캐스팅)
		byte value4 = 9;			// int => byte 
		short value5 = 11;			// int => short 
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println();
		
		// 수동(자동, 명시) 타입 변환
		byte value6 = (byte)128;		// int => byte (다운캐스팅)
		byte value9 = (byte)129;		// -127로 변환
		byte value10 = (byte)-129;		// 127로 변환
		int value7 = (int)3.5;			// double => int (다운캐스팅)
		float value8 = (float)7.5;		// double => float (다운캐스팅)
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
	}
}






