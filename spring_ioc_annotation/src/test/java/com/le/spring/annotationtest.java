package com.le.spring;

import com.le.spring.controller.UserController;
import com.le.spring.dao.UserDao;
import com.le.spring.service.UserService;
import com.le.spring.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class annotationtest {
    @Test
    public void test(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
