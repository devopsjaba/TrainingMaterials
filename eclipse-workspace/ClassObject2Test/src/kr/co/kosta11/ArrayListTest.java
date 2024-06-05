package kr.co.kosta11;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		// ArrayList 생성
		ArrayList<Book> libray = new ArrayList<>();
		
		// add() 메서드로 요소 값 추가
		libray.add(new Book("금강산1", "오리남"));
		libray.add(new Book("금강산2", "오리남"));
		libray.add(new Book("금강산3", "오리남"));
		libray.add(new Book("금강산4", "오리남"));
		libray.add(new Book("금강산5", "오리남"));
		
		// 배열에 추가된 요소 개수만큼 출력
		for(int i=0; i < libray.size(); i++) {
			Book book = libray.get(i);
			book.showInfo();
		}
		System.out.println();
		
		for(Book book : libray)
			book.showInfo();
	}
}





