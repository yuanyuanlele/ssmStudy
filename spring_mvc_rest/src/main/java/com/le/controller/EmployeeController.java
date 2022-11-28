package com.le.controller;

import com.le.dao.EmployeeDao;
import com.le.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        Collection<Employee> allEmployee=employeeDao.getAll();
        //将员工信息在请求域中共享
        model.addAttribute("allEmployee",allEmployee);
        //跳转到列表页面
        return "employee_list";
    }
}
