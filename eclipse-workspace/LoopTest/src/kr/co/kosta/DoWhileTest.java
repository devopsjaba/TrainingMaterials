package kr.co.kosta;

import java.util.Scanner;

// 입력 받는 모든 숫자의 합을 구하시오. 단, 입력이 0이 되면 반복을 그만하고 합을 하시오.
public class DoWhileTest {
	public static void main(String[] args) {
		System.out.print("정수를 입력하시오. (단 0 입력시 입력종료) : ");
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		do {
			input = scanner.nextInt();
			sum += input;
		} while(input != 0);
		
		System.out.println(sum);
		
		scanner.close();
	}
}
