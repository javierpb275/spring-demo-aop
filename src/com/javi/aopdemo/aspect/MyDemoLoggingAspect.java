package com.javi.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice
	
	//Run this code BEFORE - target object method: "public void addAccount()". 
	//@Before("execution(public void add*())")//match method starting with "add" in any class. (public void addAccount()): Pointcut expression. Match addAccount() method in any class
	@Before("execution(* add*())")//* add*(): match with any return type.void add*():match method with "void" return type. Will only match on "void" return type for add* methods
	public void beforeAddAccountAdvice() {
		
		// Add our custom code (that will be run BEFORE that given method)
		
		System.out.println("\n=======>>>>>> Executing @Before advice on addAccount()");
		
	}

}
