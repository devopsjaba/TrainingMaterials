package kr.co.kosta;

// 자연수를 순서대로 더해 합계가 처음으로 100보다 커지는 때의 숫자와 합계를 출력하시오.
// 예시) 2까지의 합 = 101
public class WhileTest3 {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		while(sum < 100) {
			sum += num;
			num++;
		}
		System.out.println((num-1) +"까지의 합 = "+ sum);
	}
}
