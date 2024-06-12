package kr.co.quiz2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseTest {

	//배열 요소 a[idx1]와 a[idx2]의 값을 교환 
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for (int i = 0; i <a.length/2; i++) 
			swap(a, i, a.length-i-1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = scanner.nextInt();		
		int[] x = new int[num];       //요소수가 num인 배열 
		
		for(int i=0; i < num; i++) {
			System.out.print("x[" +i+ "]: ");
			x[i] = scanner.nextInt();
		}
		
		reverse(x); 			//역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬합니다.");
		System.out.println("x = " + Arrays.toString(x));
		
		scanner.close();
				
	}
}





