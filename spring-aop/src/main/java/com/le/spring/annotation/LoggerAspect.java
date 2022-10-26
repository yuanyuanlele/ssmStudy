package com.le.spring.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {
    @Before("execution(public int com.le.spring.annotation.CalculatorImpl.add(int,int))")
    public void beforeAdviceMethod(){
        System.out.println("loggeraspect,前置通知");
    }
}
