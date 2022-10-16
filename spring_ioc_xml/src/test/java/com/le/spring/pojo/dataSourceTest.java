package com.le.spring.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class dataSourceTest {
    @Test
    public void testdataSource(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-datasource.xml");
        DataSource dataSource=ioc.getBean(DataSource.class);
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
