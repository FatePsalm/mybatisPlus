package com.baomidou.test.service.impl;

import com.baomidou.test.entity.City;
import com.baomidou.test.mapper.CityMapper;
import com.baomidou.test.service.ICityService;
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
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {

}
