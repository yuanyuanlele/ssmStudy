package com.le.mybatis.test;

import com.le.mybatis.mapper.UserMapper;
import com.le.mybatis.pojo.User;
import com.le.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class ParameterTest {
    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=userMapper.getUserByUsername("admin");
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testCheckLogin(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=userMapper.checkLogin("admin","123456");
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<>();
        map.put("username","阿瑟东");
        map.put("password","123456");
        User user=userMapper.checkLoginByMap(map);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=new User(null,"阿瑟东","123456",30,"男","469874968@qq.com");
        userMapper.insertUser(user);
        sqlSession.close();
    }
    @Test
    public void gounan(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
    }
}
