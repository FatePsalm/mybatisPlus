package com.solace.mybatisselect.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.solace.mybatisselect.beans.User;
import com.solace.mybatisselect.mapper.UserMapper;
import com.solace.mybatisselect.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author CaoGang
 * @since 2018-09-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
