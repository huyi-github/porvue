package com.huyi.porvue.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import com.huyi.porvue.entity.RoleVo;
import com.huyi.porvue.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */
public interface IRoleService extends IService<Role> {

    IPage<RoleVo> selectPageVo(Page page, RoleVo roleVo);
}
