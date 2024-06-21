package kr.co.kosta2;

public class StringComcatImplTest {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Kosta";
		StringConcat concat = new StringComcatImpl();
		concat.makeString(s1, s2);
	}
}
