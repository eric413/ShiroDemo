package com.eric.shirodemo.config;

import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author JinChen
 * @Title: urlConfig
 * @Package com.eric.shirodemo.config
 * @Description: TODO()
 * @date 2019/8/2 17:36
 * Copyright (c) 1994-2019 Scjydz.com All Rights Reserved.
 */
@Component
public class UrlConfig {
    @Resource
    private WebApplicationContext webApplicationContext;
    public void getUrls(){
        RequestMappingHandlerMapping mapping = webApplicationContext.getBean(RequestMappingHandlerMapping.class);
        Map<RequestMappingInfo, HandlerMethod> map = mapping.getHandlerMethods();
        //装载url信息结果集
        for (Map.Entry<RequestMappingInfo, HandlerMethod> m : map.entrySet()) {
            RequestMappingInfo info = m.getKey();
            PatternsRequestCondition p = info.getPatternsCondition();
        }
    }
}
