package com.eric.shirodemo.shiro;

import org.apache.shiro.subject.Subject;
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
        Subject subject = getSubject(request, response);
        String[] permsArray = (String[]) o;

/*        String[] newPerms = new String[permsArray.length + 1];
        for (int i = 0; i < permsArray.length; i++) {
            newPerms[i] = permsArray[i];
        }
        newPerms[newPerms.length - 1] = "admin";*/
        //没有设置权限的默认通过，设置了权限的则加一类admin的权限，只要用户有admin权限都让通过
        if (permsArray == null || permsArray.length == 0) { //没有角色限制，有权限访问
            return true;
        }
        boolean flag = false;
        //有一个权限符合条件则通过
        for (String perms : permsArray) {
            if (subject.isPermitted(perms))
                flag = true;
        }
        if (flag)
            return true;
        return false;
    }
}
