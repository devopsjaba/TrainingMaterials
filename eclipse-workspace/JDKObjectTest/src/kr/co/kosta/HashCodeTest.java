package kr.co.kosta;

public class HashCodeTest {
	public static void main(String[] args) {
		String str1 = new String("kosta");
		String str2 = new String("kosta");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println();
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		Integer i1 = new Integer(200);
		Integer i2 = new Integer(200);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
	}
}
