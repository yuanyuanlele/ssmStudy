package com.le.spring.dao.impl;

import com.le.spring.dao.UserDao;
import com.le.spring.pojo.User;

public class UserDaoImpl implements UserDao {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        System.out.println("保存成功！");
    }
}
