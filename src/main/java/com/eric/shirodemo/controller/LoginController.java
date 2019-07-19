package com.eric.shirodemo.controller;

import com.eric.shirodemo.entity.vo.Message;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JinChen
 * @Title: LoginController
 * @Package com.eric.shirodemo.controller
 * @Description: TODO()
 * @date 2019/7/19 11:20
 * Copyright (c) 1994-2019 Scjydz.com All Rights Reserved.
 */
@RestController
public class LoginController {
    @RequestMapping("login")
    public Message login(String username, String password){
        Subject subject = SecurityUtils.getSubject();
        try {
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
            token.setRememberMe(false);
            subject.login(token);
            return new Message().ok(200).addData("data","登录成功");
        } catch (Exception e) {
            SecurityUtils.getSubject().getSession().setAttribute("userInfo",null);
            return new Message().error(400,"登录失败，账户名或者密码错误！");
        }

    }
}
