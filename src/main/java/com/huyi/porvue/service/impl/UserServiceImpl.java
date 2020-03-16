package com.huyi.porvue.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.User;
import com.huyi.porvue.entity.UserVo;
import com.huyi.porvue.mapper.UserMapper;
import com.huyi.porvue.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public IPage<User> selectPageVo(Page page, UserVo userVo) {
        return userMapper.selectPageVo(page,userVo);
    }
}
