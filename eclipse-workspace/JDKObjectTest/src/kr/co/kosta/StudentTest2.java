package kr.co.kosta;

public class StudentTest2 {
	public static void main(String[] args) {
		String str1 = new String("kosta");
		String str2 = new String("kosta");
		
		System.out.println(str1 == str2);  // 두 인스턴스 주소 값이 같은지 비교
		System.out.println(str1.equals(str2));	//String 클래스의 equals()메서드 사용.
												//두 인스턴스의 문자열 값이 같은지 비교하여 출력		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println(i1 == i2);	// 두 인스턴스 주소 값이 같은지 비교
		System.out.println(i1.equals(i2)); //Integer 클래스의 두 인스턴스의 정수값이 같은지 비교하여 출력 
	}
}
