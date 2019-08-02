package com.dflm.weixin.business.model.user.service.impl;

import com.dflm.weixin.business.model.user.model.User;
import com.dflm.weixin.business.model.user.mapper.UserMapper;
import com.dflm.weixin.business.model.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author CG
 * @since 2019-08-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
