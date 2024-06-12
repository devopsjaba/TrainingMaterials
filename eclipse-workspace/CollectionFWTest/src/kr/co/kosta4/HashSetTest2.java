package kr.co.kosta4;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,2,4,6,7,1,3};
		
		//hashSet객체 생성
		Set<Integer> sets = new HashSet<>();
		for(int number : nums)
			sets.add(number);
		
		System.out.println("유일한 숫자들");
		for(int number : sets)
			System.out.print(number + "\t");
	}
}
