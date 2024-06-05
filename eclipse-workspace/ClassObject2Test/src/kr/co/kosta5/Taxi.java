package kr.co.kosta5;

public class Taxi {
	String companyName;
	int money;
	
	public Taxi(String companyName) {
		//super();
		this.companyName = companyName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(companyName + "님의 수입은 " +money+ "원 입니다.");
	}
}
