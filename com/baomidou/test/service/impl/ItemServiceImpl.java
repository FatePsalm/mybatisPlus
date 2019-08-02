package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Item;
import com.baomidou.test.mapper.ItemMapper;
import com.baomidou.test.service.IItemService;
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
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements IItemService {

}
