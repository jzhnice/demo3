package com.dzqc.demo3.controller;
import com.dzqc.demo3.service.YUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;
/**
 * @author jzh
 * @date 2022/3/14 17:01
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private YUserService service;

    @RequestMapping( value = "/login",method = RequestMethod.POST)
    public ModelAndView login(String condition, String password) {
        ModelAndView mv = new ModelAndView();
        Map<String, Object> result = service.login(condition, password);
//        如果登陆失败 | 用户名不存在 | 密码错误等
        String msg = "";

        String viewName = "/";
        if ((Integer) result.get("code") == 0) {
            msg = "登陆失败";
            viewName = "login";
        } else {
            msg = "登陆成功，欢迎你";
            viewName = "main";
        }
        mv.addObject("msg", msg);
        mv.addObject("loginUser", result.get("loginUser"));
        mv.setViewName(viewName);
        return mv;

    }

}
