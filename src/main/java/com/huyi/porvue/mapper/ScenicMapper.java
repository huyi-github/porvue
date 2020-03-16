package com.huyi.porvue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.Scenic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huyi.porvue.entity.ScenicVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huyi
 * @since 2020-03-14
 */
public interface ScenicMapper extends BaseMapper<Scenic> {

    IPage findAll(Page page, ScenicVo vo);
}
