package com.le.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class testParamController {
    @RequestMapping(value = "/param")
    public String getParam(String username, String password, @RequestHeader("referer") String referer,
                           @CookieValue ("JSESSIONID") String jsessionid){
        System.out.println("username:"+username+"  password"+password+"daka"+"daka");
        return "success";
    }
}
