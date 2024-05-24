package kr.co.kosta3;

public class ContinueControlKeywordTest2 {
	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {		// 100까지 반복
			if(num % 2 == 0)					// num 값이 짝수인 경우
				continue;						// 이후 수행을 생략하고 num++ 수행
			total += num;						// num값이 홀수인 경우에만 수행
		}
		System.out.println("1부터 100까지의 홀수의 합은 " +total+ "입니다.");
		
		System.out.println();
		// 1 ~ 100까지 자연수 중 3의 배수만 출력하시오.
		
		int i;
		for(i = 1; i <= 100; i++) {
			if(i % 3 != 0) continue;
			System.out.println(i);
		}
		
	}
}






