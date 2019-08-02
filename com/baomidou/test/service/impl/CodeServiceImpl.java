package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Code;
import com.baomidou.test.mapper.CodeMapper;
import com.baomidou.test.service.ICodeService;
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
public class CodeServiceImpl extends ServiceImpl<CodeMapper, Code> implements ICodeService {

}
