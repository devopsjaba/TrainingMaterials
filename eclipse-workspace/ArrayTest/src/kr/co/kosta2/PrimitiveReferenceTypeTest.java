package kr.co.kosta2;

public class PrimitiveReferenceTypeTest {
	public static void main(String[] args) {
		// 기본 자료형 변수 복사 (대입 연산)
		int a = 3;
		int b = a;
		b = 7;
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		// 참조 자료형 변수 복사 
		int[] a2 = {3, 4, 5};
		int[] b2 = a2;
		b2[0] = 7;
		System.out.println(b2[0]);
		System.out.println(a2[0]);
		
	}
}
