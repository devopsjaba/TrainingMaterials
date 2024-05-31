package kr.co.kosta3;

public class ContinueControlKeywordTest {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			continue;
			//System.out.println(i);	// 오류 (unreached error)
		}
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);  	// 0, 1, 2, 3, 4, 6, 7, 8, 9
		}
	}
}
