package kr.co.kosta4;

public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonunsRatio;
	
//	public Customer() {
//		//super();
//		customerGrade = "SILVER";		//기본 등급 
//		bonunsRatio = 0.01;				//보너스 적립비율 
//		System.out.println("상위 클래스 생성자 호출--");
//	}
		
	public Customer(int customerId, String customerName) {
		//super();
		customerGrade = "SILVER";
		this.customerId = customerId;
		this.customerName = customerName;
	}



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}	
	
	// 지불 가격, 보니스 포인트 적립
	public int calPrice(int price) {
		bonusPoint += price * bonunsRatio;
		return price;
	}
	
	public String showInfo() {
		return customerName +"님의 등급은 "+ customerGrade 
			+ "이며, 보너스 포인트는  "+ bonusPoint + "입니다." ;
	}
}


















