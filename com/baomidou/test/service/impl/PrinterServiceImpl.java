package com.baomidou.test.service.impl;

import com.baomidou.test.entity.Printer;
import com.baomidou.test.mapper.PrinterMapper;
import com.baomidou.test.service.IPrinterService;
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
public class PrinterServiceImpl extends ServiceImpl<PrinterMapper, Printer> implements IPrinterService {

}
