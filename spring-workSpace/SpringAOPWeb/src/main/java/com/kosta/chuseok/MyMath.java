package com.kosta.chuseok;

import org.springframework.stereotype.Component;

@Component
public class MyMath {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public int substract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a  /  b;
	}	
	
	
	
}
