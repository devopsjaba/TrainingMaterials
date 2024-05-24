package kr.co.kosta2;

import java.util.Arrays;

public class ArrayDataTest {
	public static void main(String[] args) {
		int[] array = new int[] {3, 4, 5, 6, 7};
		
		// 배열의 길이 구하기
		System.out.println(array.length);
		
		// 배열의 인덱스 번호를 사용해 배열의 모든 원소 값 1개씩 출력
		System.out.print(array[0] + " ");
		System.out.print(array[1] + " ");
		System.out.print(array[2] + " ");
		System.out.print(array[3] + " ");
		System.out.print(array[4] + " ");
		System.out.println();
		
		// length
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// for ~ each
		for(int k : array) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// Arrays.toString()
		System.out.println(Arrays.toString(array));
	}
}







