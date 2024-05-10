package kr.co.kosta2;

public class DoubleTest2 {
	public static void main(String[] args) {
		double dnum = 1;
		
		for(int i=0; i<10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);		// 약간의 오차를 감수하고라도 더 넓은 범위의 실수 값 표현하기 위함 
	}
}
