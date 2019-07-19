package com.eric.shirodemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JinChen
 * @Title: TestController
 * @Package com.eric.shirodemo.controller
 * @Description: TODO()
 * @date 2019/7/19 11:22
 * Copyright (c) 1994-2019 Scjydz.com All Rights Reserved.
 */
@RestController

public class TestController {
    @RequestMapping("test")
    public String hello(){
        return "hello";
    }
}
