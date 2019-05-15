package com.eric.shirodemo.shiro;

import org.apache.shiro.web.filter.authz.AuthorizationFilter;
import org.apache.shiro.web.filter.authz.PermissionsAuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author JinChen
 * @Title: MyFilter
 * @Package com.eric.shirodemo.shiro
 * @Description: TODO(重写授权)
 * @date 2019/5/15 16:13
 * Copyright (c) 1994-2018 Scjydz.com All Rights Reserved.
 */
public class MyFilter extends AuthorizationFilter {
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object o) throws Exception {
        return false;
    }
}
