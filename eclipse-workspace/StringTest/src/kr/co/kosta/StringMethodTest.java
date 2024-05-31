package kr.co.kosta;

import java.util.Arrays;

public class StringMethodTest {
	public static void main(String[] args) {
		//문자열 길이
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";	
		System.out.println(str1.length());
		System.out.println(str2.length());	//한글,영문 구분없이 한 문자당 1개의 크기를 가짐.
		
		//문자열 검색
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1));
		System.out.println();
		
		System.out.println(str1.indexOf('a'));		// 앞에서부터 첫 번째 'a'가 위치한 인덱스 
		System.out.println(str1.lastIndexOf('a'));	// 뒤에서부터 첫 번째 'a'가 위치한 인덱스
		System.out.println(str1.indexOf('a', 8));
		System.out.println(str1.lastIndexOf('a', 8));
		
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.lastIndexOf("Java"));
		
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));		
		
		System.out.println(str1.indexOf("HTML"));		// 해당 문자(열)이 없는 경우 -1 리턴 
		
		//문자열 변환
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		//문자열 연결
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		byte[] array1 = str1.getBytes();
		byte[] array2 = str2.getBytes();
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		char[] array3 = str1.toCharArray();
		char[] array4 = str2.toCharArray();

		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
	}
}





