package kr.co.kosta5;

public class Powder {
	public void doPrint() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Powder입니다.";
	}
}
