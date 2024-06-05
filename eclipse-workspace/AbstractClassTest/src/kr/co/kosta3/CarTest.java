package kr.co.kosta3;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("=====자율 주행 자동차======");
		Car myCar = new GenerativeAICar();
		myCar.run();
		
		System.out.println("=====사람이 운전하는 자동차======");
		Car manualCar = new ManualCar();
		manualCar.run();
	}
}
