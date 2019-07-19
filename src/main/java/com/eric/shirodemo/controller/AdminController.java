package com.eric.shirodemo.controller;

import com.eric.shirodemo.entity.vo.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JinChen
 * @Title: AdminController
 * @Package com.eric.shirodemo.controller
 * @Description: TODO()
 * @date 2019/7/19 16:45
 * Copyright (c) 1994-2019 Scjydz.com All Rights Reserved.
 */
@RequestMapping("/admin")
@RestController
public class AdminController {
    @RequestMapping("hello")
    public Message hello(){
        return new Message().ok(200).addData("data","hello world");
    }
}
