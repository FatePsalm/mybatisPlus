package com.baomidou.test.service.impl;

import com.baomidou.test.entity.UserAttention;
import com.baomidou.test.mapper.UserAttentionMapper;
import com.baomidou.test.service.IUserAttentionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户关注表 服务实现类
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
@Service
public class UserAttentionServiceImpl extends ServiceImpl<UserAttentionMapper, UserAttention> implements IUserAttentionService {

}
