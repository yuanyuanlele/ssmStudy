package com.le.mybatis.mapper;

import com.le.mybatis.pojo.Emp;
import com.le.mybatis.pojo.EmpExample;
import com.le.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EmpMapperTest {
    @Test
    public void testMbg(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        EmpMapper empMapper=sqlSession.getMapper(EmpMapper.class);
        EmpExample empExample=new EmpExample();
        empExample.createCriteria().andEmpNameLike("掌声");
        List<Emp> emps=empMapper.selectByExample(empExample);
        for (Emp emp : emps) {
            System.out.println(emp);
        }

    }

}