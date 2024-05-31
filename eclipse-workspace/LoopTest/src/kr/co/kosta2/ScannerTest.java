package kr.co.kosta2;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
			/*
		 * 	3개의 정수값을 입력하고 최대값을 구하여 출력하시오.
		 * 		- 예시) 세 정수의 최대값을 구하시오.
		 * 			   a의 값:  1
		 * 			   b의 값:  5
		 * 			   c의 값:  2
		 * 			   최대값은 5입니다.			
		 */
		System.out.println("세 정수의 최대값을 구하시오.");
		System.out.print("a의 값: ");  int a = stdIn.nextInt();
		System.out.print("b의 값: ");  int b = stdIn.nextInt();
		System.out.print("c의 값: ");  int c = stdIn.nextInt();
		
		int max = a; 
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("최대값은 " +max+ "입니다.");
		
		stdIn.close();
	}
}








