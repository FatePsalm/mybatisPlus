package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Foodtype;
import com.baomidou.test.mapper.FoodtypeMapper;
import com.baomidou.test.service.IFoodtypeService;
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
public class FoodtypeServiceImpl extends ServiceImpl<FoodtypeMapper, Foodtype> implements IFoodtypeService {

}
