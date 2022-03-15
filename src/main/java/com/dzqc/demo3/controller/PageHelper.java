package com.dzqc.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jzh
 * @date 2022/3/14 17:37
 */
@Controller
@RequestMapping("/")
public class PageHelper {

    @RequestMapping(value = "" ,method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("/login");
        return mv;
    }
}
