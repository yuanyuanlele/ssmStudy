package com.le.mybatis.mapper;

import com.le.mybatis.pojo.Emp;
import com.le.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
    @Test
    public void testinsertMoreEmp(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        DynamicSQLMapper dynamicSQLMapper=sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1=new Emp(null,"asf",20,"男");
        Emp emp2=new Emp(null,"fg",20,"男");
        Emp emp3=new Emp(null,"dfg",20,"男");
        Emp emp4=new Emp(null,"ert",20,"男");
        List<Emp> emps=Arrays.asList(emp1,emp2,emp3,emp4);
        dynamicSQLMapper.insertMoreEmp(emps);
        List<Emp> list=dynamicSQLMapper.getAllEmp();
        for (Emp emp : list) {
            System.out.println(emp);
        }
        sqlSession.close();
    }
    @Test
    public void testdeleteMoreEmp(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        DynamicSQLMapper dynamicSQLMapper=sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] integers=new Integer[]{5,6,7,8};
        dynamicSQLMapper.deleteMoreEmp(integers);
        List<Emp> list=dynamicSQLMapper.getAllEmp();
        for (Emp emp : list) {
            System.out.println(emp);
        }
        sqlSession.close();
    }

}