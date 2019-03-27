package com.zhiyou100.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("password")
public class UpdatePasswordController {

    @RequestMapping("forward")
    public ModelAndView registrationInfor(){
        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }
}
