package com.le.spring.pojo;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testStudent(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student studentone=(Student) ioc.getBean(Student.class);
        System.out.println(studentone);
    }

}