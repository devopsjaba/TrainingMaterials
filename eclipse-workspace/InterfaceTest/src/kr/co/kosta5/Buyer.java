package kr.co.kosta5;

public interface Buyer {
	void buy();
	
	default void order() {
		System.out.println("구매 주문");
	}
}
