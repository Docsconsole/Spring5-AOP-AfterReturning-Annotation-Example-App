package com.docsconsole.tutorials.spring5aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ProductLoggingAspect {
     
	@AfterReturning("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.*(..))")
    public void logAroundAllMethods(JoinPoint joinPoint) 
    {
        System.out.println(":::::::--> LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName());
    }
     
	@AfterReturning("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.getProductById(..))")
    public void logAroundGetProduct(JoinPoint joinPoint) 
    {
        System.out.println(":::::::--> LoggingAspect.logAroundGetProduct() : " + joinPoint.getSignature().getName());
    }
     
	@AfterReturning("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.createProduct(..))")
    public void logAroundCreateProduct(JoinPoint joinPoint) 
    {
        System.out.println(":::::::--> LoggingAspect.logAroundCreateProduct() : " + joinPoint.getSignature().getName());
    }
}	