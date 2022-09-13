package com.le.mybatis.mapper;

import com.le.mybatis.pojo.User;

import java.util.Map;

public interface UserMapper {
    User getUserByUsername(String username);
    User checkLogin(String username,String password);
    User checkLoginByMap(Map<String,Object> map);
    int insertUser(User user);
}
