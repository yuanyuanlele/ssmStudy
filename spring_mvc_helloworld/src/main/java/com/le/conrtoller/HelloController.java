package com.le.conrtoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
    @RequestMapping("/")
    public String portal(){
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
