package kr.co.kosta;

public class FloatDoubleTest {
	public static void main(String[] args) {
		//float의 정밀도(대략 소수 7자리)
		float f1 = 1.0000001f;
		System.out.println(f1);
		
		//double의 정밀도(대략 소수 15자리 정도)
		float f2 = 1.00000001f;		// 오차 발생 
		System.out.println(f2);
		
		double d1 = 1.000000000001;
		System.out.println(d1);
		
		double d2 = 1.0000000000000000001;		// 오차 발생 
		System.out.println(d2);		
	}
}
