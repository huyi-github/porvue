package com.huyi.porvue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huyi.porvue.entity.ResultEntity;
import com.huyi.porvue.entity.UserRole;
import com.huyi.porvue.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequestMapping("/userRole")
public class UserRoleController {

    @Autowired
    private IUserRoleService iUserRoleService;

    @RequestMapping("/insert")
    public ResultEntity insertRids(Integer uid,Integer [] rids){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("uid",uid);
        iUserRoleService.remove(wrapper);

        if (rids!=null && rids.length>0){
            List list = new ArrayList();
            for (Integer rid :rids){
                UserRole role = new UserRole();
                role.setUid(uid);
                role.setRid(rid);
                list.add(role);
            }
            iUserRoleService.saveBatch(list);
        }
        return ResultEntity.ok(true);
    }
}

