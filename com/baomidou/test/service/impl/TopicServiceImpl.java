package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Topic;
import com.baomidou.test.mapper.TopicMapper;
import com.baomidou.test.service.ITopicService;
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
public class TopicServiceImpl extends ServiceImpl<TopicMapper, Topic> implements ITopicService {

}
