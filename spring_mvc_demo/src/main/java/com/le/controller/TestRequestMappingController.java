package com.le.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {
    @RequestMapping("/")
    public String protal(){
        return "index";
    }
    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
