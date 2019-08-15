package com.eric.shirodemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.eric.shirodemo.entity.po.AuthUser;
import com.eric.shirodemo.entity.vo.Message;
import com.eric.shirodemo.service.IAuthUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
    @Resource
    private IAuthUserService authUserService;
    @RequestMapping(value = "hello",name = "hello")
    public Message hello(){
        return new Message().ok(200).addData("data","hello world");
    }
    @RequestMapping(value = "add",name = "添加")
    public Message add(){
        return new Message().ok(200).addData("data","hello world");
    }
    @RequestMapping(value = "list")
    @ResponseBody
    public Message getPage(Integer current, Integer size, AuthUser user){
        PageHelper.startPage(current, size);
        QueryWrapper<AuthUser> queryWrapper = new QueryWrapper<>();
        List<AuthUser> list = authUserService.list();
        PageInfo<AuthUser> pageInfo = new PageInfo(list);
        return new Message().ok(200).addData("data",pageInfo);
    }
}
