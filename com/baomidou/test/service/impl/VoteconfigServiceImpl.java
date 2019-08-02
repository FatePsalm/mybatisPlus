package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Voteconfig;
import com.baomidou.test.mapper.VoteconfigMapper;
import com.baomidou.test.service.IVoteconfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 投票配置表：设置投票参数 服务实现类
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
@Service
public class VoteconfigServiceImpl extends ServiceImpl<VoteconfigMapper, Voteconfig> implements IVoteconfigService {

}
