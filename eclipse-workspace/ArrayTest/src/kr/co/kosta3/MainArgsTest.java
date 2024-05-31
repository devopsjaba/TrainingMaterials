package kr.co.kosta3;

public class MainArgsTest {
	public static void main(String[] ar) {
		String a = ar[0];
		String b = ar[1];
		String c = ar[2];
		String d =  ar[3];
		
		System.out.println(a); System.out.println(b); System.out.println(c); System.out.println(d); 
		System.out.println();
		
		System.out.println(b + 1);
		System.out.println(c + 2);
		
		int e = Integer.parseInt(b);		// String => int로 변환 
		System.out.println(e + 1);			// int + int = int로 연산
		
		double f = Double.parseDouble(c);	// String => double로 변환
		System.out.println(f + 1);			// double + int = double로 연산 
		
	}
}
