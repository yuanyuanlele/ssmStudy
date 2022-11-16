package com.le.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class testParamController {
    @RequestMapping(value = "/param")
    public String getParam(String username,String password){
        System.out.println("username:"+username+"  password"+password);
        return "success";
    }
}
