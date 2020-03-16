package com.huyi.porvue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.*;
import com.huyi.porvue.service.IMenuRoleService;
import com.huyi.porvue.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService iRoleService;

    @Autowired
    private IMenuRoleService iMenuRoleService;

    @RequestMapping("/list")
    public ResultEntity list(){
        return ResultEntity.ok(iRoleService.list());
    }

    //列表展示
    @RequestMapping("/select")
    public ResultEntity select(@RequestParam(defaultValue = "1")long current,
                               @RequestParam(defaultValue = "5")long size, RoleVo roleVo){
        Page page = new Page(current, size);
        IPage<RoleVo> pageInfo = iRoleService.selectPageVo(page,roleVo);
        return ResultEntity.ok(pageInfo);
    }
    //单个删除
    @RequestMapping("/delete")
    public ResultEntity delete(Integer id){
        return ResultEntity.ok(iRoleService.removeById(id));
    }
    //批量删除
    @RequestMapping("/deletes")
    public ResultEntity deletes(Integer [] ids){
        for(Integer id:ids){
            QueryWrapper wrapper = new QueryWrapper();
            wrapper.eq("rid",id);
            iMenuRoleService.remove(wrapper);
        }
        boolean flag = iRoleService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(flag);
    }

    @RequestMapping("/update")
    public ResultEntity update(@RequestBody Role role){
        boolean flag = iRoleService.updateById(role);
        return ResultEntity.ok(flag);
    }

}

