package com.eric.shirodemo.service.impl;

import com.eric.shirodemo.entity.po.AuthAccountLog;
import com.eric.shirodemo.dao.AuthAccountLogMapper;
import com.eric.shirodemo.service.IAuthAccountLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录注册登出记录 服务实现类
 * </p>
 *
 * @author ben
 * @since 2019-07-22
 */
@Service
public class AuthAccountLogServiceImpl extends ServiceImpl<AuthAccountLogMapper, AuthAccountLog> implements IAuthAccountLogService {

}
