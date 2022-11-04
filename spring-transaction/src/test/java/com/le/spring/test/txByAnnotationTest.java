package com.le.spring.test;

import com.le.spring.controller.BookController;
import com.le.spring.dao.BookDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class txByAnnotationTest {
    @Autowired
    private BookController bookController;
    @Test
    public void test(){
        bookController.buyBook(1,1);
    }
}
