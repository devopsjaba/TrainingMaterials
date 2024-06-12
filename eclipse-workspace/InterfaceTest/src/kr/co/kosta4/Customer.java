package kr.co.kosta4;

// Customer 클래스는 Buy, Sell 인터페이스를 모두 구현함 
public class Customer implements Buyer, Seller {

	@Override
	public void sell() {
		System.out.println("구매하기");
	}

	@Override
	public void buy() {
		System.out.println("판매하기");
	}

}
