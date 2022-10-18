package com.le.spring.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class factorybeantest {
    @Test
    public void testfactorybean(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-factory.xml");
        User user=ioc.getBean(User.class);
        System.out.println(user);
    }
}
