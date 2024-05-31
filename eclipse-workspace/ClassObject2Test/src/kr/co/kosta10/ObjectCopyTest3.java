package kr.co.kosta10;

public class ObjectCopyTest3 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("아차산1", "코스타");
		bookArray1[1] = new Book("아차산2", "코스타");
		bookArray1[2] = new Book("아차산3", "코스타");
		
		// 기본생성자로 bookArray2 배열 인스턴스 생성
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();		
		
		// bookArray1 배열요소를 새로 생성한 bookArray2 배열 인스턴스에 복사 
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setTitle(bookArray1[i].getTitle());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
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





