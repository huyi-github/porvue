package com.huyi.porvue.service.impl;

import com.huyi.porvue.entity.Test;
import com.huyi.porvue.mapper.TestMapper;
import com.huyi.porvue.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
