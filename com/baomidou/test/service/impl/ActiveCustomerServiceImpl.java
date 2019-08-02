package com.baomidou.test.service.impl;

import com.baomidou.test.entity.ActiveCustomer;
import com.baomidou.test.mapper.ActiveCustomerMapper;
import com.baomidou.test.service.IActiveCustomerService;
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
public class ActiveCustomerServiceImpl extends ServiceImpl<ActiveCustomerMapper, ActiveCustomer> implements IActiveCustomerService {

}
