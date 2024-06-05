package kr.co.kosta4;

public class Subway {
	
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		//super();
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(lineNumber +" 지하철의 승객은 "+ passengerCount +"명 이고, 그 수입은 " +money+ 
				"원 입니다.");		
	}
}
