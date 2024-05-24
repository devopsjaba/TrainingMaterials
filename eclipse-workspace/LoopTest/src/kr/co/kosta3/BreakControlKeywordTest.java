package kr.co.kosta3;

public class BreakControlKeywordTest {
	public static void main(String[] args) {
		// 단일 반복문 탈출
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			break;			// 반복문 탈출 실행
		}
		
		System.out.println();
		
		// 단일 반복문 if문과 함께 break 사용
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;		// if문 안 실행할 조건 설정 
			}
			System.out.println(i);
		}
		
		System.out.println();
		
		// 이중 for문 내에서 break 문 통한 탈출 
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 3) break;
				System.out.println(i +", "+ j);
			}	// break로 탈출하는 반복문 
		}
		
		System.out.println();
		
		// 레이블을 이용해 이중 for문 한 번에 탈출하기
		out:		// 레이블 위치 지정(break하고자 하는 반복문 앞에 레이블 표기)
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 3)
					break out;	// out 레이블이 달린 반복문 탈출
				System.out.println(i +", "+ j);
			}
		} // break out으로 탈출하는 중괄호 
	}
}






