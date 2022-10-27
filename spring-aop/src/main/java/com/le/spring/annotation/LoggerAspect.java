package com.le.spring.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggerAspect {

    @Pointcut("execution(* com.le.spring.annotation.CalculatorImpl.*(..))")
    public void pointcut(){}

    //@Before("execution(public int com.le.spring.annotation.CalculatorImpl.add(int,int))")
    @Before("pointcut()")
    public void beforeAdviceMethod(JoinPoint joinPoint){
        //获取连接点所对应方法的签名信息
        Signature signature=joinPoint.getSignature();
        //获取连接点所对应方法的参数
        Object[] args=joinPoint.getArgs();
        System.out.println("loggeraspect,方法："+signature.getName()+"参数："+ Arrays.toString(args));
    }
}
