package kr.co.kosta6;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		tree.add("이순신");
		tree.add("류성룡");
		tree.add("신사임당");
		tree.add("최무선");
		tree.add("신사임당");
		
		System.out.println("객체 수 : " + tree.size());
		
		//Iterator 반복자에 의해 출력하기
		for(Iterator<String> itr = tree.iterator(); itr.hasNext(); )
			System.out.print(itr.next().toString() + "\t");
		System.out.println();	
		
	}
}
