package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Material;
import com.baomidou.test.mapper.MaterialMapper;
import com.baomidou.test.service.IMaterialService;
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
public class MaterialServiceImpl extends ServiceImpl<MaterialMapper, Material> implements IMaterialService {

}
