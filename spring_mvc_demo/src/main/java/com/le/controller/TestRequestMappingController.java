package com.le.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {
    @RequestMapping("/")
    public String protal(){
        return "index";
    }
    @RequestMapping(
            value = "/hello",
            method = {RequestMethod.GET,RequestMethod.POST},
            headers = {"referer"}
    )
    public String hello(){
        return "success";
    }

    @RequestMapping("/test/rest/{id}")
    public String testRest(@PathVariable("id") Integer id){
        System.out.println("id:"+id);
        return "success";
    }
}
