package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Points;
import com.baomidou.test.mapper.PointsMapper;
import com.baomidou.test.service.IPointsService;
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
public class PointsServiceImpl extends ServiceImpl<PointsMapper, Points> implements IPointsService {

}
