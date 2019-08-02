package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Pageview;
import com.baomidou.test.mapper.PageviewMapper;
import com.baomidou.test.service.IPageviewService;
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
public class PageviewServiceImpl extends ServiceImpl<PageviewMapper, Pageview> implements IPageviewService {

}
