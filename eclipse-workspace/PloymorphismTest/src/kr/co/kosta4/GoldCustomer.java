package kr.co.kosta4;

/*
 * 	* 다형성을 활용한 고객관리 프로그램 확장 
 * 		- 중간 멤버십 생성하기
 * 		- 일반고객보다는 많이 구매하고 VIP보다는 적게 구매하는 고객이 대상
 * 		- 혜택
 * 			- 제품 구매시 10프로 할인하기
 * 			- 보너스 포인트는 2% 적립하기  
 */
public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "GOLD";
		this.bonunsRatio = 0.02;
		this.saleRatio = 0.1;
	}
	
	@Override
	public int calPrice(int price) {
		this.bonusPoint += price * bonunsRatio;
		return price - (int)(price * saleRatio);
	}

}








