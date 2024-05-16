package kr.co.kosta2;

public class ConversionTest {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;		// byte형 값이 int형 변수에 대입됨 
		
		byte bNum2 = (byte)iNum;	// 강제로 형을 바꾸려면 바꿀 형을 괄호를 써서 명시해야 함 	
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;		//int형 값이 float값 변수로 대입됨 

		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
	}
}
