package kr.co.kosta;

import java.util.Arrays;

public class StringMethod2Test {
	public static void main(String[] args) {
		String str1 = "Java Study!";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.replace("Study", "공부"));
		
		System.out.println(str1.substring(0, 5));
		
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray));
		
		System.out.println("   abc    ".trim());
		
		// 문자열의 내용 비교
		String str2 = new String("Java");	//new로 생성해 메모리에 별도의 객체로 생성
		String str3 = new String("Java");
		String str4 = new String("Java");
		String str5 = new String("JAVA");
		
		// == 위치(번지)비교
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);
		
		// equals(), equalsIgnoreCase() : 내용 비교
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str4.equalsIgnoreCase(str5));
	}
}











