package com.huyi.porvue.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.Scenic;
import com.baomidou.mybatisplus.extension.service.IService;
import com.huyi.porvue.entity.ScenicVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huyi
 * @since 2020-03-14
 */
public interface IScenicService extends IService<Scenic> {

    IPage findAll(Page page, ScenicVo vo);
}
