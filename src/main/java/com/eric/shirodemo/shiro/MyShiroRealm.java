package com.eric.shirodemo.shiro;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.eric.shirodemo.entity.po.AuthUser;
import com.eric.shirodemo.service.IAuthUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    @Autowired
    private IAuthUserService authUserService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("权限认证doGetAuthorizationInfo()");
        String username = (String) super.getAvailablePrincipal(principalCollection);
        System.out.println("username = " + username);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        simpleAuthorizationInfo.addRole("admin");
        //添加登录用户所有权限列表
        simpleAuthorizationInfo.addStringPermission("admin");
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("登陆认证doGetAuthenticationInfo()");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        System.out.println("token = " + token.getUsername());
        QueryWrapper<AuthUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",token.getUsername());
        AuthUser user = authUserService.getOne(queryWrapper);
        if(user != null)
        {
            //假设用户成功登陆，存入session。如果登陆失败，则在service中将session重置为空。
            SecurityUtils.getSubject().getSession().setAttribute("userInfo",user);
            //将正确信息写入口令，并返回
            return new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),ByteSource.Util.bytes(user.getSalt()),getName());
        }
        return null;
    }
}
