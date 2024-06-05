package kr.co.kosta10;

public class ObjectCopyTest2 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("아차산1", "코스타");
		bookArray1[1] = new Book("아차산2", "코스타");
		bookArray1[2] = new Book("아차산3", "코스타");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray2.length; i++)
			bookArray2[i].showInfo();
		
		System.out.println("============bookArray1============");
		bookArray1[0].setAuthor("오리인");	// bookArray1 배열의 첫번째 요소 값 변경
		bookArray1[0].setTitle("도봉산1");
		
		for(int i = 0; i < bookArray1.length; i++)
			bookArray1[i].showInfo();	
		
		System.out.println("============bookArray2============");
		for(int i = 0; i < bookArray2.length; i++)		//bookArray2 배열의 첫번째 요소 값 변경
			bookArray2[i].showInfo();		
		
	}
}





