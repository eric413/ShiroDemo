package com.eric.shirodemo.service.impl;

import com.eric.shirodemo.entity.po.AuthResource;
import com.eric.shirodemo.dao.AuthResourceMapper;
import com.eric.shirodemo.service.IAuthResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源信息表(菜单,资源) 服务实现类
 * </p>
 *
 * @author ben
 * @since 2019-07-22
 */
@Service
public class AuthResourceServiceImpl extends ServiceImpl<AuthResourceMapper, AuthResource> implements IAuthResourceService {

}
