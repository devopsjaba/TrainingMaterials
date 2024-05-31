package kr.co.kosta8;

/*
 * 자동차 공장이 있습니다.  자동차 공장이 유일한 객체이고, 
 * 이 공장에서 생산되는 자동차는 제작될 때마다 고유의 번호가 부여됩니다.
 * 자동차 번호가 10001부터 시작되어 자동차가 생산될 때마다 10002, 10003 이렇게 번호가 붙도록 
 * 자동차 공장 클래스, 자동차 클래스를 구현하시오. 
 * 
 */
public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car myGenesis = factory.createCar();
		Car myBmw = factory.createCar();
		Car myBenz = factory.createCar();
		
		System.out.println(myGenesis.getCarNum());
		System.out.println(myBmw.getCarNum());
		System.out.println(myBenz.getCarNum());
	}
}
