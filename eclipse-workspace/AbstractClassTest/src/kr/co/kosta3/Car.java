package kr.co.kosta3;
/*
=====자율 주행 자동차======
시동을 켭니다
자율 주행합니다.
자동차가 알아서 방향을 전환합니다.
비나 눈이 양에 따라 빠르기가 자동으로 조절됩니다
스스로 멈춥니다.
시동을 끕니다
=====사람이 운전하는 자동차======
시동을 켭니다
사람이 운전한다.
사람이 핸들을 조작합니다.
비나 눈이 오면 사람이 빠르기를 조절합니다.
브레이크로 정지합니다.
시동을 끕니다
 
 */
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	//템플릿 메서드
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
	
}
