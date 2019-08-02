package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Foodorder;
import com.baomidou.test.mapper.FoodorderMapper;
import com.baomidou.test.service.IFoodorderService;
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
public class FoodorderServiceImpl extends ServiceImpl<FoodorderMapper, Foodorder> implements IFoodorderService {

}
