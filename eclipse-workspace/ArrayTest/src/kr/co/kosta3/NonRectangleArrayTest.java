package kr.co.kosta3;

public class NonRectangleArrayTest {
	public static void main(String[] args) {
		int[][] a = new int[2][];
		a[0] = new int[2];			// 첫 번째 행의 열의 갯수
		a[0][0] = 1; a[0][1] = 2;
		a[1] = new int[3];			// 두 번째 행의 열의 갯수 
		a[1][0] = 3; a[1][1] = 4; a[1][2] = 5;
		
		int[][] b = new int[2][];
		b[0] = new int[] {1,2};
		b[1] = new int[] {3, 4, 5};
		System.out.println(b.length);
		System.out.println(b[0].length);
		System.out.println(b[1].length);
		System.out.println();
		
		int[][] c = new int[][] {{1,2}, {3,4,5}};
		
		int[][] d = {{1,2}, {3,4,5}};
		
		for(int i = 0; i < d.length; i++) {
			for(int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int[] m : d) {
			for(int n : m) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}

















