package kr.co.kosta;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		//객체 저장 : 순서 있음. 중복 허용
		list.add("orange");
		list.add("apple");
		list.add("apple");
		list.add("banana");
		
		//객체 참조
		for(int i=0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		
		System.out.println();
		
		//첫번째 객체 삭제
		list.remove(0);
		for(int i=0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');		
	}
}





