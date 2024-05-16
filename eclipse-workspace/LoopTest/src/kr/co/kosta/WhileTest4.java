package kr.co.kosta;

public class WhileTest4 {
	public static void main(String[] args) {
		//while 문으로 만든 무한 루프
//		while(true) {
//			System.out.println("무한 루프");
//		}
		
		int temp = 0;
		while(true) {
			if(temp > 10) {
				break;
			}
			System.out.print(temp + " ");
			temp++;
		}
		
	}
}
