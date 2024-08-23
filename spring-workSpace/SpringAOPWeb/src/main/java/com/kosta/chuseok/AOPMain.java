package com.kosta.chuseok;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AOPMain {

	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context_aop.xml");
		MyMath mm = (MyMath) ac.getBean("myMath");
		
		System.out.println(mm.add(3, 5));
		System.out.println(mm.add(1,2,3));
		System.out.println(mm.multiply(3, 5));
		System.out.println(mm.substract(5, 3));
		
		try {
			System.out.println(mm.divide(5, 0));
		} catch(Exception e) {
			e.getMessage();
		}
		
	}
}
