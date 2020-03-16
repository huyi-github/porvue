package com.huyi.porvue.mapper;

import com.huyi.porvue.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> listMenus();

    List<Menu> listByUserName(String userName);
}
