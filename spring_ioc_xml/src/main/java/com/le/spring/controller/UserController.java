package com.le.spring.controller;

import com.le.spring.service.UserService;
import com.le.spring.service.impl.UserServiceImpl;

public class UserController
{
    private UserService userService=new UserServiceImpl();

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public void saveUser(){
        userService.saveUser();
    }
}
