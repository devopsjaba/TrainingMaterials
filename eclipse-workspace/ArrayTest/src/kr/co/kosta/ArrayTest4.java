package kr.co.kosta;

import java.util.Arrays;

public class ArrayTest4 {
	public static void main(String[] args) {
		// 스택 메모리에 위치하는 변수는 초기화 없이 출력 불가함 
		int value1;
		// System.out.println(value1);    //오류
		int[] value2;
		// System.out.println(value2);    //오류 
		
		int value3 = 0;
		System.out.println(value3);		// 0으로 초기화 
		int[] value4 = null;
		System.out.println(value4);		// null로 초기화 
		
		// 힙 메모리의 초기값 설정
		boolean[] array1 = new boolean[3];	// false로 초기화 
		for(int i = 0; i < 3; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		int[] array2 = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.print(array2[i] + " ");
		}	
		System.out.println();
		
		// 참조 자료형 배열
		String[] array3 = new String[3];		// null로 초기화 
		for(int i = 0; i < 3; i++) {
			System.out.print(array3[i] + " ");
		}
		System.out.println();
		
		// 배열 원소 내용을 한번에 출력하기
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
	}
}













