package kr.co.kosta5;

public interface Seller {
	void sell();
	
	default void order() {
		System.out.println("판매 주문");
	}
}
