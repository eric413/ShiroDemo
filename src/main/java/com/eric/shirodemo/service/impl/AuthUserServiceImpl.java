package com.eric.shirodemo.service.impl;

import com.eric.shirodemo.entity.po.AuthUser;
import com.eric.shirodemo.dao.AuthUserMapper;
import com.eric.shirodemo.service.IAuthUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author ben
 * @since 2019-07-22
 */
@Service
public class AuthUserServiceImpl extends ServiceImpl<AuthUserMapper, AuthUser> implements IAuthUserService {

}
