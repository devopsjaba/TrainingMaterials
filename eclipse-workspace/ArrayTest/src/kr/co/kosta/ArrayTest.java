package kr.co.kosta;

public class ArrayTest {
	public static void main(String[] args) {
		// 배열 선언
		int[] array1;			// int 자료형만 저장 가능
		double[] array2;		// double 자료형만 저장 가능
		String[] str;  			// String 자료형만 저장 가능 
		
		// 배열 생성
		array1 = new int[3];		// 정수 자료형 3개를 포함할 수 있는 배열 객체 생성
		array2 = new double[5];		// 실수 자료형 5개를 포함할 수 있는 배열 객체 생성
		str = new String[10];		// 문자열 자료형 10개를 포함할 수 있는 배열 객체 생성
		
		// 기본 자료형, 참조 자료형 배열 
		boolean[] array3 = new boolean[3];
		int[] array4 = new int[5];
		double[] array5 = new double[7];
		String[] array6 = new String[9];
		
	}
}
