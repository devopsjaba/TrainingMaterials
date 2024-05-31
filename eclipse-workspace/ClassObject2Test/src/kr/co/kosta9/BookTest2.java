package kr.co.kosta9;

public class BookTest2 {
	public static void main(String[] args) {
		Book[] libray = new Book[5];
		
		libray[0] = new Book("청계산1", "코스타");
		libray[1] = new Book("청계산2", "코스타");
		libray[2] = new Book("청계산3", "코스타");
		libray[3] = new Book("청계산4", "코스타");
		libray[4] = new Book("청계산5", "코스타");
		
		for(int i = 0; i<libray.length; i++) {
			System.out.println(libray[i]);
			libray[i].showInfo();
		}
	}
}
