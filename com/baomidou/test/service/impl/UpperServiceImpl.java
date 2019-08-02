package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Upper;
import com.baomidou.test.mapper.UpperMapper;
import com.baomidou.test.service.IUpperService;
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
public class UpperServiceImpl extends ServiceImpl<UpperMapper, Upper> implements IUpperService {

}
