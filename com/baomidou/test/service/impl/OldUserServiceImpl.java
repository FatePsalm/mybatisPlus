package com.baomidou.test.service.impl;

import com.baomidou.test.entity.OldUser;
import com.baomidou.test.mapper.OldUserMapper;
import com.baomidou.test.service.IOldUserService;
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
public class OldUserServiceImpl extends ServiceImpl<OldUserMapper, OldUser> implements IOldUserService {

}
