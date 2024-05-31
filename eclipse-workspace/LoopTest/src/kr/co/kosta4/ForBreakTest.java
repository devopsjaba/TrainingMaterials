package kr.co.kosta4;

public class ForBreakTest {
	public static void main(String[] args) {
		// 구구단을 단보다 곱하는 수가 작거나 같은경우까지만 출력하는 프로그램을 작성하시오.
		/*
		 *    2X1=2
		 *    2X2=4
		 *    
		 *    3X1=3
		 *    3X2=6
		 *    3X3=9
		 *    
		 *    4X1=4
		 *    4X2=8
		 *    4X3=12
		 *    4X4=16
		 *    
		 *    .....
		 *    
		 *    9x1=9
		 *    ..
		 *    9x9=81
		 */
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++) {
				if(times > dan) break;
				System.out.println(dan +"X"+ times +"="+ dan*times);
			}
			System.out.println();
		}		
	}
}







