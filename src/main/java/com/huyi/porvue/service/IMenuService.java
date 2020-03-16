package com.huyi.porvue.service;

import com.huyi.porvue.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> listMenus();

    List<Menu> listByUserName(String userName);
}
