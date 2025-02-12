package kr.co.together03;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class Car {
	String color;
	int oil;
	Engine engine;
	Door[] doors;
	
	public Car() {}			//기본 생성자를 꼭 만들어줘야함 
	
	public Car(String color, int oil, Engine engine, Door[] doors) {
		//super();
		this.color = color;
		this.oil = oil;
		this.engine = engine;
		this.doors = doors;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void setDoors(Door[] doors) {
		this.doors = doors;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", oil=" + oil + ", engine=" + engine + ", doors=" + Arrays.toString(doors)
				+ "]";
	}
	
	
}
class Engine {}
class Door {}

public class SpringDITest {

	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("config3.xml");
		Car car = (Car) ac.getBean("car");				//byName
		Engine engine = (Engine) ac.getBean("engine");   //byName
		Door door = (Door) ac.getBean("door");
		
		System.out.println("car = "  + car);
	}
}








