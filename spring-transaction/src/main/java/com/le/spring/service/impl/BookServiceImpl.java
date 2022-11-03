package com.le.spring.service.impl;

import com.le.spring.dao.BookDao;
import com.le.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    @Override
    public void buyBook(Integer userId, Integer bookId) {
        //查询图书价格
        Integer price=bookDao.getPriceByBookId(bookId);
        //更新图书库存
        bookDao.updateStock(bookId);
        //更新用户余额
        bookDao.updateBalance(userId,price);
    }
}
