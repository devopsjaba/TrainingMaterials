package kr.co.kosta4;

public class VIPCustomer extends Customer {
	private int agentId;		// VIP 고객 담당 상담원 아이디 
	double saleRatio;			// 할인율 
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		//super();	// 컴파일러가 자동으로 추가하는 코드 
		super(customerId, customerName);
		customerGrade = "VIP";		// 고객등급
		bonunsRatio = 0.05;			// 보너스 적립 5%
		saleRatio = 0.1;			// 할인율 10% 
		System.out.println("VIPCustomer() 생성자 호출--");
	}
	
	@Override
	public int calPrice(int price) {
		bonusPoint += price * bonunsRatio;
		return price-(int)(price*saleRatio);
	}
	
	public String showInfo() {
		return customerName +"님의 등급은 "+ customerGrade + "이며, 보너스 포인트는  "+ bonusPoint + "입니다." ;
	}
}
