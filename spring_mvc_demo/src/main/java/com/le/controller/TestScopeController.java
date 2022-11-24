package com.le.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

@Controller
public class TestScopeController {
    @RequestMapping("/test/mav")
    public ModelAndView testMAV(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("testRequestScope","hello,modelandview");
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping("/test/session")
    public String TestSession(HttpSession session){
        session.setAttribute("testSessionScope","hello,session");
        return "success";
    }
    @RequestMapping("/test/application")
    public String TestApplication(HttpSession session){
        ServletContext servletContext=session.getServletContext();
        servletContext.setAttribute("testApplicationScope","hello,application");
        return "success";
    }
}
