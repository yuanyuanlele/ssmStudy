package com.le.mybatis.mapper;

import com.le.mybatis.pojo.Emp;
import com.le.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DynamicSQLMapperTest {
    @Test
    public void testgetEmpByCondition(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        DynamicSQLMapper dynamicSQLMapper=sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp=new Emp(null,"掌声",20,"男");
        List<Emp> emps=dynamicSQLMapper.getEmpByCondition(emp);
        for (Emp emp1 : emps) {
            System.out.println(emp1);
        }
        sqlSession.close();
    }

}