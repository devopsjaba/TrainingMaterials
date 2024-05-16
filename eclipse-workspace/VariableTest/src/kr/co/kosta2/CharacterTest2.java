package kr.co.kosta2;

public class CharacterTest2 {
	public static void main(String[] args) {
		int intVal1 = 65;
		int intVal2 = -66;
		
		char chVal1 = 65;
		//char chVal2 = -66;		// 문자형 변수에 음수를 넣으면 오류 발생함 
		
		System.out.println((char)intVal1);
		System.out.println((char)intVal2);		// 알수 없는 문자 
		System.out.println(chVal1);
	}
}
