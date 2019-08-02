package com.baomidou.test.service.impl;

import com.baomidou.test.entity.UserBanned;
import com.baomidou.test.mapper.UserBannedMapper;
import com.baomidou.test.service.IUserBannedService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
@Service
public class UserBannedServiceImpl extends ServiceImpl<UserBannedMapper, UserBanned> implements IUserBannedService {

}
