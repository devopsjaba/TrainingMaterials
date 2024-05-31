package kr.co.kosta10;

public class ObjectCopyTest {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("아차산1", "코스타");
		bookArray1[1] = new Book("아차산2", "코스타");
		bookArray1[2] = new Book("아차산3", "코스타");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray2.length; i++)
			bookArray2[i].showInfo();
	}
}
