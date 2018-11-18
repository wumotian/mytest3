package com.itheima.controller;


import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/doRegister")
    public String add(User user) {
        int cnt = userService.add(user);
//        return "redirect:/product/list";
        return "login";
    }


    @RequestMapping(value = "/doLogin")
    public String doLogin(User user, Model model) {
        User user1 = userService.findByName(user);
        if (user.getPassword().equals(user1.getPassword())) {
            model.addAttribute("user",user1);
            return "success";
        }
        return "login";
    }

}
