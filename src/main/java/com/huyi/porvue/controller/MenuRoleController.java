package com.huyi.porvue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huyi.porvue.entity.MenuRole;
import com.huyi.porvue.entity.ResultEntity;
import com.huyi.porvue.entity.Role;
import com.huyi.porvue.service.IMenuRoleService;
import com.huyi.porvue.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */
@Controller
@RequestMapping("/menuRole")
public class MenuRoleController {

    @Autowired
    private IMenuRoleService iMenuRoleService;

    @RequestMapping("/insert")
    public ResultEntity insert(Integer rid,Integer [] mids){
        //首先删除中间表的rid
        //先删除角色对应的资源
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("rid",rid);
        iMenuRoleService.remove(wrapper);

        //判断操作
        if(mids!=null && mids.length>0) {
            //遍历
            for (Integer mid : mids) {
                MenuRole menu_role = new MenuRole();
                menu_role.setMid(mid);
                menu_role.setRid(rid);
                iMenuRoleService.save(menu_role);
            }
        }
        return ResultEntity.ok(true);
    }

}

