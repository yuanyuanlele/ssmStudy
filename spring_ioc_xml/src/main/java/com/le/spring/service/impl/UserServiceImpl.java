package com.le.spring.service.impl;

import com.le.spring.dao.UserDao;
import com.le.spring.dao.impl.UserDaoImpl;
import com.le.spring.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
