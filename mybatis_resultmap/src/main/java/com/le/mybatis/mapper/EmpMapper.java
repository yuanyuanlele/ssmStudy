package com.le.mybatis.mapper;

import com.le.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;


public interface EmpMapper {
    Emp getEmpByEmpIdOld(@Param("empid")Integer empid);
    Emp getEmpByEmpId(@Param("empid") Integer empid);
    Emp getEmpAndDeptByEmpId(@Param("empid")Integer empid);
    Emp getEmpAndDeptByStep1(@Param("empid")Integer empid);
}