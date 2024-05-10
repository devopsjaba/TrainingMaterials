package kr.co.kosta;

public class RangeOfVariable {
	public static void main(String[] args) {
		int value1 = 3;				// 변수 value1이 생성되는 시점
		{
			int value2 = 5;			// 변수 value2이 생성되는 시점
			System.out.println(value1);
			System.out.println(value2);
		} // 변수 value2이 소멸되는 시점 	
		
		System.out.println(value1);
		//System.out.println(value2);		//오류	
	} // 변수 value2이 소멸되는 시점 
}
