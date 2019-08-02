package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Feedback;
import com.baomidou.test.mapper.FeedbackMapper;
import com.baomidou.test.service.IFeedbackService;
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
public class FeedbackServiceImpl extends ServiceImpl<FeedbackMapper, Feedback> implements IFeedbackService {

}
