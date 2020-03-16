package com.huyi.porvue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huyi.porvue.entity.UserVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */
public interface UserMapper extends BaseMapper<User> {

    IPage<User> selectPageVo(Page page, UserVo userVo);
}
