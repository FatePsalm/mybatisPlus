package com.baomidou.test.service.impl;

import com.baomidou.test.entity.UserLevelInfo;
import com.baomidou.test.mapper.UserLevelInfoMapper;
import com.baomidou.test.service.IUserLevelInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户等级信息表 服务实现类
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
@Service
public class UserLevelInfoServiceImpl extends ServiceImpl<UserLevelInfoMapper, UserLevelInfo> implements IUserLevelInfoService {

}
