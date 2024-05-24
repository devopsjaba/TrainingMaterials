package kr.co.kosta2;

public class NestedForTest2 {
	public static void main(String[] args) {
		// 중첩 반복문으로 구구단을 3단부터 7단까지만 출력하시오.
		int dan;
		int times;
		
		for(dan = 3; dan <= 7; dan++) {
			for(times = 1; times <= 9; times++) {
				System.out.println(dan +"X"+ times +"="+ dan*times);
			}
			System.out.println();
		}
	}
}
