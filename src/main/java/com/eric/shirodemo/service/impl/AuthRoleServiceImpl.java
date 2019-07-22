package com.eric.shirodemo.service.impl;

import com.eric.shirodemo.entity.po.AuthRole;
import com.eric.shirodemo.dao.AuthRoleMapper;
import com.eric.shirodemo.service.IAuthRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色信息表 服务实现类
 * </p>
 *
 * @author ben
 * @since 2019-07-22
 */
@Service
public class AuthRoleServiceImpl extends ServiceImpl<AuthRoleMapper, AuthRole> implements IAuthRoleService {

}
