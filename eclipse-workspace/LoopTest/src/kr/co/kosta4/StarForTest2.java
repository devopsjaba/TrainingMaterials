package kr.co.kosta4;

/*
 * 			*
 * 		   ***
 * 		  *****
 * 		 *******
 * 		  *****
 * 		   ***
 * 			* 	
 */


public class StarForTest2 {
	public static void main(String[] args) {
		int lineCount = 7;
		int spaceCount = lineCount/2 + 1;
		int starCount = 1;
		
		for(int i = 0; i < lineCount; i++) {
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j = 0; j < starCount; j++) {
				System.out.print('*');
			}
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(' ');
			}
			
			if(i < lineCount/2) {
				spaceCount -= 1;
				starCount += 2;			
			}
			else {
				spaceCount += 1;
				starCount -= 2;					
			}
			System.out.println();
		}		
	}
}







