package com.eric.shirodemo.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Service;

/**
 * @author JinChen
 * @Title: MyShiroRealm
 * @Package com.eric.shirodemo.shiro
 * @Description: TODO(realm是权限和登录管理的具体实现)
 * @date 2019/5/15 15:57
 * Copyright (c) 1994-2018 Scjydz.com All Rights Reserved.
 */
@Service
public class MyShiroRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("权限认证doGetAuthorizationInfo()");
        String username = (String) super.getAvailablePrincipal(principalCollection);
        System.out.println("username = " + username);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //simpleAuthorizationInfo.addRole("admin");
        simpleAuthorizationInfo.addStringPermission("admin:test");
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("登陆认证doGetAuthenticationInfo()");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        System.out.println("token = " + token.getUsername());
//        UserInfo userInfo = userInfoService.findByUsername(token.getUsername());
//        if(userInfo != null)
//        {
//            return new SimpleAuthenticationInfo(userInfo.getUsername(),userInfo.getPassword(),getName());
//        }
        return null;
    }
}
