package kr.co.kosta;

public class WhileTest2 {
	public static void main(String[] args) {
		//1에서 50까지의 합
		int num = 1;
		int sum = 0;
		
		while(num <= 50) {
			sum += num;
			num++;
		}
		System.out.println("1부터 50까지의 합은 " +sum+ "입니다.");
	}
}
