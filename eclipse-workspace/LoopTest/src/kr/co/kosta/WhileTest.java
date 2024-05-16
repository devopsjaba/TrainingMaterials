package kr.co.kosta;

public class WhileTest {
	public static void main(String[] args) {
		//1에서 10까지의 합
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " +sum+ "입니다.");
	}
}
