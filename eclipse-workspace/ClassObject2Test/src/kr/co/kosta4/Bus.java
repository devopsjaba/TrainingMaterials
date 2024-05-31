package kr.co.kosta4;

public class Bus {
	
	int busNumber;
	int passengerCounter;
	int money;

	public Bus(int busNumber) {
		//super();
		this.busNumber = busNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCounter++;
	}
	
	public void showInfo() {
		System.out.println(busNumber +"번 버스의 승객은 "+ passengerCounter +"명 이고, 그 수입은 " +money+ 
				"원 입니다.");
	}

}
