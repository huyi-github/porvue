package com.huyi.porvue.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.Scenic;
import com.huyi.porvue.entity.ScenicVo;
import com.huyi.porvue.mapper.ScenicMapper;
import com.huyi.porvue.service.IScenicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huyi
 * @since 2020-03-14
 */
@Service
public class ScenicServiceImpl extends ServiceImpl<ScenicMapper, Scenic> implements IScenicService {

    @Autowired
    private ScenicMapper scenicMapper;

    @Override
    public IPage findAll(Page page, ScenicVo vo) {
        return scenicMapper.findAll(page,vo);
    }
}
