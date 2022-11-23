package com.le.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TestScopeController {
    @RequestMapping("/test/mav")
    public ModelAndView testMAV(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("testRequestScope","hello,modelandview");
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
