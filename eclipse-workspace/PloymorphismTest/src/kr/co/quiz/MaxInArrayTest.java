package kr.co.quiz;

import java.util.Scanner;

/*
 * 	배열의 최대값을 구하시오.
 *  사람 숫자 : 6
 *  height[0] : 173
 *  height[1] : 157
 *  height[2] : 191
 *  height[3] : 141
 *  height[4] : 167
 *  height[5] : 179
 *  최대값은 191입니다.
 */
public class MaxInArrayTest {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구하시오.");
		System.out.print("사람 숫자 : ");
		int num = stdIn.nextInt();		// 베열의 요소수를 입력받음

		int[] height = new int[num];	// 요소수가 num인 배열 생성
		
		for(int i = 0; i < num; i++) {
			System.out.print("height[" +i+ "] : ");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("최대값은 " + maxheight(height) + "입니다.");
		
		stdIn.close();
	}

	// 배열 arr의 최대값을 구하는 메서드 
	public static int maxheight(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}























