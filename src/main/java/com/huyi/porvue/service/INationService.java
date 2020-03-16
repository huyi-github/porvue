package com.huyi.porvue.service;

import com.huyi.porvue.entity.Nation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.huyi.porvue.entity.NationVo;

import java.util.List;

/**
 * <p>
 * 城市字典表 服务类
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */
public interface INationService extends IService<Nation> {

    //查询所有的数据
    List<NationVo> findAll();
}
