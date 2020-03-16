package com.huyi.porvue.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.Role;
import com.huyi.porvue.entity.RoleVo;
import com.huyi.porvue.entity.User;
import com.huyi.porvue.mapper.RoleMapper;
import com.huyi.porvue.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public IPage<RoleVo> selectPageVo(Page page, RoleVo roleVo) {
        return roleMapper.selectPageVo(page,roleVo);
    }
}
