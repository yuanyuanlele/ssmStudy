package com.le.spring.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class LoggerAspectTestbyxml {
    @Test
    public void test(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(1,1);
    }

}