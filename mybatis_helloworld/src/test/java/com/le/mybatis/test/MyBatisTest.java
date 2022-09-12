package com.le.mybatis.test;

import com.le.mybatis.mapper.UserMapper;
import com.le.mybatis.pojo.User;
import com.le.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void testInsert() throws IOException {
        InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        int result=userMapper.insertUser();
        System.out.println(result);
        sqlSession.close();
    }
    @Test
    public void testUpdate(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        int result=userMapper.updateUser();
        System.out.println(result);
        sqlSession.close();
    }
    @Test
    public void testDelete(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        int result=userMapper.deleteUser();
        System.out.println(result);
        sqlSession.close();
    }
    @Test
    public void testGetUserById(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=userMapper.getUserbyId();
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> list=userMapper.getAllUser();
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
