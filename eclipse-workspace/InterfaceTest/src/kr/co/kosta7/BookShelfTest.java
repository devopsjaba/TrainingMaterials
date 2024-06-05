package kr.co.kosta7;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		//순서대로 요소를 추가 
		shelfQueue.enQueue("오리역1");
		shelfQueue.enQueue("오리역2");
		shelfQueue.enQueue("오리역3");
		
		//입력 순서대로 요소를 꺼내서 출력 
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
