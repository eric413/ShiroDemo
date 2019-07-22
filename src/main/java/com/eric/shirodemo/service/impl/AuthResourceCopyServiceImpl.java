package com.eric.shirodemo.service.impl;

import com.eric.shirodemo.entity.po.AuthResourceCopy;
import com.eric.shirodemo.dao.AuthResourceCopyMapper;
import com.eric.shirodemo.service.IAuthResourceCopyService;
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
public class AuthResourceCopyServiceImpl extends ServiceImpl<AuthResourceCopyMapper, AuthResourceCopy> implements IAuthResourceCopyService {

}
