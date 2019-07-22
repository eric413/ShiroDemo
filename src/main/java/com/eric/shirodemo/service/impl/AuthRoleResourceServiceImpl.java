package com.eric.shirodemo.service.impl;

import com.eric.shirodemo.entity.po.AuthRoleResource;
import com.eric.shirodemo.dao.AuthRoleResourceMapper;
import com.eric.shirodemo.service.IAuthRoleResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源角色关联表 服务实现类
 * </p>
 *
 * @author ben
 * @since 2019-07-22
 */
@Service
public class AuthRoleResourceServiceImpl extends ServiceImpl<AuthRoleResourceMapper, AuthRoleResource> implements IAuthRoleResourceService {

}
