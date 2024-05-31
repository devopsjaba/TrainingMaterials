package kr.co.kosta;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] array1 = new int[3];
		System.out.println(array1[0] +" "+ array1[1] +" "+ array1[2]);
		
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		// 예외발생 : 없는 인덱스를 사용하면 예외(exception)가 발생하고 프로그램 종료됨 
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2] /* + ""+ array1[3] */);
		
		int[] array2 = new int[] {6,7,8};
		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
	}
}
