package com.kosta.chuseok;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {
    //@Around("execution(* com.kosta.chuseok.MyMath.*(..))")			//pointcut -  부가기능이 적용될 메서드의 패턴 
	public Object methodCallLog(ProceedingJoinPoint pjp) throws Throwable {
		
		long start = System.currentTimeMillis();
		System.out.println("");
		System.out.println("[start] ");
		Object result = pjp.proceed();	 		// target의 메서드를 호출 
		
		System.out.println((System.currentTimeMillis() - start) + "ms");
		System.out.println("result = "  + result);
		System.out.println("[end] ");
		System.out.println("");
		
		return result;
	}
    
    //@Before("execution(public * com.kosta.chuseok..*(..))")
    public void before(JoinPoint joinpoint) {
    	String signature =  joinpoint.getSignature().getName();
    	System.out.println("@Before [ " +signature+ " ] 메서드 실행 전처리 수행");
    	for (Object arg : joinpoint.getArgs()) {
    		System.out.println("@Before [ " +signature+ " ] 메서드 아규먼트 " + arg);
    	}
    	System.out.println("");
    }
    
    //@After("execution(* *..*.*add(..))")
    public void after(JoinPoint joinPoint) {
    	String signature = joinPoint.getSignature().getName();
    	System.out.println("@After [  " +signature+  " ] 메서드 실행  후처리 수행");
    }
    
    //@AfterReturning(pointcut = "execution(public * com.kosta.chuseok.*.*(..))", returning = "ret")
    public void afterReturning(JoinPoint joinPoint, Object ret) {
    	String signature = joinPoint.getSignature().getName();
    	System.out.println("@AfterReturning [  " +signature+  " ] 메서드 실행  후처리 수행");
    	System.out.println("@AfterReturning [  " +signature+  " ] 리턴 값 = " + ret);
    	System.out.println("");
    }
    
    @AfterThrowing(pointcut = "execution(* *..chuseok.*.*(..))", throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Throwable ex) {
    	String signature = joinPoint.getSignature().getName();
    	System.out.println("@AfterThrowing [  " +signature+  " ] 메서드 실행  중 예외 발생");
    	System.out.println("@AfterThrowing [  " +signature+  " ] 예외 = " + ex.getMessage());
    	System.out.println("");    	
    }
}








