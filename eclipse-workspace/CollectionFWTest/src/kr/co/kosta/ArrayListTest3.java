package kr.co.kosta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		//객체 저장 : 순서 있음. 중복 허용
		list.add("orange");
		list.add("apple");
		list.add("apple");
		list.add("banana");
		
		//객체 참조 - 반복자 획득
		Iterator<String> itr = list.iterator();
		
		//반복자 이용한 순차적 참조
		String str0;
		while(itr.hasNext()) {
			str0 = itr.next();
			System.out.print(str0 + " ");
		}
		
		System.out.println();
		
		//첫번째 객체 삭제
		list.remove(0);
		for(int i=0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');		
	}
}





