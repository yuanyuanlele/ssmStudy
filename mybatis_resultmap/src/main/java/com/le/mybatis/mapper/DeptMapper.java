package com.le.mybatis.mapper;

import com.le.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    public Dept getEmpAndDeptByStep2(Integer deptid);
    public Dept getDeptAndEmpByDeptId(@Param("deptid") Integer deptid);
    public Dept getDeptAndEmpByStep1(@Param("deptid") Integer deptid);
}
