package com.huyi.porvue.mapper;

import com.huyi.porvue.entity.Nation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huyi.porvue.entity.NationVo;

import java.util.List;

/**
 * <p>
 * 城市字典表 Mapper 接口
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */

public interface NationMapper extends BaseMapper<Nation> {
    //查询所有的数据
    List<NationVo> findAll();
}
