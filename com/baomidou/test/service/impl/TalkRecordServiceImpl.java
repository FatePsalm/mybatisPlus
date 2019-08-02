package com.baomidou.test.service.impl;

import com.baomidou.test.entity.TalkRecord;
import com.baomidou.test.mapper.TalkRecordMapper;
import com.baomidou.test.service.ITalkRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 聊啦消息记录表 服务实现类
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
@Service
public class TalkRecordServiceImpl extends ServiceImpl<TalkRecordMapper, TalkRecord> implements ITalkRecordService {

}
