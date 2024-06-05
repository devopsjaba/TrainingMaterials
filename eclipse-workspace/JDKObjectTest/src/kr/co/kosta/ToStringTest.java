package kr.co.kosta;

class Book {
	int bookNumber;
	String bookTitle;
	
	public Book(int bookNumber, String bookTitle) {
		//super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
//	@Override
//	public String toString() {
//		return bookTitle +", "+ bookNumber;
//	}
}

public class ToStringTest {
	public static void main(String[] args) {
		Book book = new Book(10020, "오리역 3번출구");
		
		System.out.println(book);				// 인스턴스 정보(클래스 이름, 주소 값)
		System.out.println(book.toString());
		
		String str = new String("kosta");
		System.out.println(str.toString());
		
		Integer int1 = new Integer(100);
		Integer int2 = 200;
		System.out.println(int1);
		System.out.println(int2);
		
		
	}
}
