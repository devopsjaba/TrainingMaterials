package kr.co.kosta3;

public class VIPCustomer0 {
	private int customerId;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonunsRatio;
	
	private int agentId;		// VIP 고객 담당 상담원 아이디 
	double saleRatio;			// 할인율 
	
	public VIPCustomer0() {
		customerGrade = "VIP";		// 고객등급
		bonunsRatio = 0.05;			// 보너스 적립 5%
		saleRatio = 0.1;			// 할인율 10% 
	}
	
	public int calPrice(int price) {
		bonusPoint += price * bonunsRatio;
		return price-(int)(price*saleRatio);
	}
	
	public String showInfo() {
		return customerName +"님의 등급은 "+ customerGrade + "이며, 보너스 포인트는  "+ bonusPoint + "입니다." ;
	}
}
