package com.eric.shirodemo.service.impl;

import com.eric.shirodemo.entity.po.AuthOperationLog;
import com.eric.shirodemo.dao.AuthOperationLogMapper;
import com.eric.shirodemo.service.IAuthOperationLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志 服务实现类
 * </p>
 *
 * @author ben
 * @since 2019-07-22
 */
@Service
public class AuthOperationLogServiceImpl extends ServiceImpl<AuthOperationLogMapper, AuthOperationLog> implements IAuthOperationLogService {

}
