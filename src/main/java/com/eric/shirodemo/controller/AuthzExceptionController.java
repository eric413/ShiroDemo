package com.eric.shirodemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 辜勇胜
 * @Title: AuthzExceptionController
 * @Package com.scjy.shiro.controller
 * @Description: TODO(未认证或者未登录时返回不同信息的接口)
 * @date 2019/7/2 13:20
 * Copyright (c) ©1994-2019 Scjydz.com All Rights Reserved.
 */
@RestController
@RequestMapping(value = "/authzException",name = "权限异常捕捉")
public class AuthzExceptionController {
    @RequestMapping(value = "/unauthorized",name = "用户无权限")
    @ResponseStatus(code = HttpStatus.UNAUTHORIZED,reason = "该用户没有权限")
    public String unauthorizedException(){
        return "该用户没有权限";
    }
    @RequestMapping(value = "/unauthenticated",name = "用户未登录")
    @ResponseStatus(code = HttpStatus.FORBIDDEN,reason = "该用户未登录")
    public String unauthenticatedException(){
        return "该用户未登录";
    }
}
