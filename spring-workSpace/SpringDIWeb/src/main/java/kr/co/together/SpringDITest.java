package kr.co.together;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class Car {}
class Engine {}
class Door {}

public class SpringDITest {

	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("config.xml");
		Car car = (Car) ac.getBean("car");				//byName
		Engine engine = (Engine) ac.getBean("engine");   //byName
		Door door = (Door) ac.getBean("door");
		
		System.out.println("car = " + car);
		System.out.println("engine = " + engine);
		System.out.println("door = " + door);
		System.out.println();
		
		Car car2 = ac.getBean(Car.class);					//byType
		Door door2 = (Door) ac.getBean("door");
		System.out.println("car2 = " + car2);
		System.out.println("door2 = " + door2);
	}
}
