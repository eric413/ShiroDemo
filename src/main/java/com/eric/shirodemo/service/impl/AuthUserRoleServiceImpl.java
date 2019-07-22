package com.eric.shirodemo.service.impl;

import com.eric.shirodemo.entity.po.AuthUserRole;
import com.eric.shirodemo.dao.AuthUserRoleMapper;
import com.eric.shirodemo.service.IAuthUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色关联表 服务实现类
 * </p>
 *
 * @author ben
 * @since 2019-07-22
 */
@Service
public class AuthUserRoleServiceImpl extends ServiceImpl<AuthUserRoleMapper, AuthUserRole> implements IAuthUserRoleService {

}
