package com.le.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class helloWorldTest {

    @Test
    public void testsayHello(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld=(HelloWorld) ioc.getBean("HelloWorld");
        helloWorld.sayHello();
    }

}