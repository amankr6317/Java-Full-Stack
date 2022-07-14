package com.yash.aopimpl.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

	@Before("myCustomMethod()")
	public void printBefore(JoinPoint joinPoint) {
		System.out.println("Payment Initilaized "+ joinPoint.getClass().getName());
	}

	@After("myCustomMethod()")
	public void printAfter() {
		System.out.println("Payment Completed");
	}
	
	@Pointcut("execution(* com.yash.aopimpl.services.PaymentServiceImpl.makePayment())")
	public void myCustomMethod() {
		System.out.println("I am in myCustomMethod()");
	}
	
//	@Pointcut("execution(* *.makePayment())")
//	public void myCustomMethod() {}
	
	
	
	
	
	
}