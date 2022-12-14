package com.le.mybatis.mapper;

import com.le.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {
    User getUserByUsername(String username);
    User checkLogin(String username,String password);
    User checkLoginByMap(Map<String,Object> map);
    int insertUser(User user);
    User checkUserByParam(@Param("username") String username,@Param("password") String password);
    Map<String,Object> getUserByIdToMap(Integer id);
    @MapKey("id")
    Map<String,Object> getAllUserByIdToMap();
    User getUserByLike(@Param("mohu") String mohu);
}
