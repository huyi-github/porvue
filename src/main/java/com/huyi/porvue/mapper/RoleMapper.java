package com.huyi.porvue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huyi.porvue.entity.RoleVo;
import com.huyi.porvue.entity.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */
public interface RoleMapper extends BaseMapper<Role> {

    IPage<RoleVo> selectPageVo(Page page, RoleVo roleVo);
}
