package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Voteitem;
import com.baomidou.test.mapper.VoteitemMapper;
import com.baomidou.test.service.IVoteitemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 投票选项表：用户提交对应资料参与投票活动。 服务实现类
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
@Service
public class VoteitemServiceImpl extends ServiceImpl<VoteitemMapper, Voteitem> implements IVoteitemService {

}
