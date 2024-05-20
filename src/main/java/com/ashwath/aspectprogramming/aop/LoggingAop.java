package com.ashwath.aspectprogramming.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAop {

	@Before(value = "execution(* com.ashwath.aspectprogramming.accounts.AccountsServiceImpl.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("This is before logged");
	}

	@After(value = "execution(* com.ashwath.aspectprogramming.accounts.AccountsServiceImpl.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("This is after logged");
	}

	@AfterReturning(value =  "execution(* com.ashwath.aspectprogramming.accounts.AccountsServiceImpl.*(..))")
	public void afterReturningAdvice(JoinPoint joinPoint) {
		System.out.println("This is after returning");
	}

	@Around("@annotation(com.ashwath.aspectprogramming.accounts.LogExecutionTime)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.currentTimeMillis();

		Object proceed = joinPoint.proceed();

		long executionTime = System.currentTimeMillis() - start;

		System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
		return proceed;
	}
}
