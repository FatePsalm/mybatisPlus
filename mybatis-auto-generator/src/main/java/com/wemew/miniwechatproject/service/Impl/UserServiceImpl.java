package com.wemew.miniwechatproject.service.Impl;

import com.wemew.miniwechatbeans.beans.User;
import com.wemew.miniwechatproject.mapper.UserMapper;
import com.wemew.miniwechatproject.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author CaoGang
 * @since 2019-04-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
