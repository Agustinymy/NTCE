package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller("register")
public class RegisterController {

    /**
     * 注册
     * @param request
     * @return
     */
    @RequestMapping(value = "/register2", produces = "text/html; charset=utf-8")
    public ModelAndView register(HttpServletRequest request){
        ModelAndView view = new ModelAndView("register");
        return view;
    }
}
