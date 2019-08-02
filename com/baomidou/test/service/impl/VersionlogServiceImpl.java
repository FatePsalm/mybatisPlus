package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Versionlog;
import com.baomidou.test.mapper.VersionlogMapper;
import com.baomidou.test.service.IVersionlogService;
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
public class VersionlogServiceImpl extends ServiceImpl<VersionlogMapper, Versionlog> implements IVersionlogService {

}
