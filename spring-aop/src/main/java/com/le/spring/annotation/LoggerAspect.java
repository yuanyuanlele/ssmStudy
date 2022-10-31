package com.le.spring.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
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
    //@After在finally里执行
    @After("pointcut()")
    public void afterAdviceMethod(JoinPoint joinPoint){
        Signature signature=joinPoint.getSignature();
        System.out.println("loggeraspect,后置通知 "+signature.getName()+"执行完毕");
    }
    @AfterReturning(value = "pointcut()" ,returning = "result")
    public void afterReturningAdviceMethod(JoinPoint joinPoint,Object result){
        System.out.println("loggeraspect,返回通知 "+"结果:"+result);
    }
    @AfterThrowing(value = "pointcut()",throwing = "ex")
    public void afterThrowingAdviceMethod(JoinPoint joinPoint,Throwable ex){
        Signature signature=joinPoint.getSignature();
        System.out.println("loggeraspect,异常通知 "+"异常： "+ex);
    }
    @Around("pointcut()")
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            System.out.println("环绕通知-->前置通知");
            result = joinPoint.proceed();
            System.out.println("环绕通知-->返回通知");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知-->异常通知");
        } finally {
            System.out.println("环绕通知-->后置通知");
        }
        return result;
    }
}
