package com.kosta.coffee.aop;

import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//핵심 기능(메서드)
class MyClass {
	void kosta1() {
		System.out.println("kosta1() 호출됨");
	}
	
	void kosta2() {
		System.out.println("kosta2() 호출됨");
	}
	
	void costa3() {
		System.out.println("costa3() 호출됨");
	}	
}

//보조 기능
class MyAdvice {
	
	Pattern p = Pattern.compile("k.*");			//메서드 이름 k로 시작하는 것(만 골라서 적용)
	
	boolean matches(Method m) {
		Matcher matcher = p.matcher(m.getName());		 //패턴에 맞는 것만 취해서 핵심기능에만 부가기능 코드가 들어가게 됨 
		return matcher.matches();
	}
	
	void invoke(Method m, Object obj, Object... args) throws Exception {
		if(matches(m)) 		// 핵심 기능에 매치되는 경우에만 출력
			System.out.println("[before]");
		m.invoke(obj, args);   // kosta1(), kosta2(), kosta3() 호출 가능 
		if(matches(m)) 
			System.out.println("[after]");
	}
	
}


public class AopMain {

	public static void main(String[] args) throws Exception {
		MyAdvice myAdvice = new MyAdvice();
		
		Class myClass = Class.forName("com.kosta.coffee.aop.MyClass");
		Object obj = myClass.newInstance();
		
		for(Method m : myClass.getDeclaredMethods()) {
			myAdvice.invoke(m, obj, null);
		}
		
	}
}








