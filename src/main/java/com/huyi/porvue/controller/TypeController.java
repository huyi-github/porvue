package com.huyi.porvue.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.ResultEntity;
import com.huyi.porvue.entity.ScenicVo;
import com.huyi.porvue.service.IScenicService;
import com.huyi.porvue.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huyi
 * @since 2020-03-14
 */
@RestController
@RequestMapping("/type")
public class TypeController {
    @Autowired
    private ITypeService iTypeService;

    @RequestMapping("/list")
    public ResultEntity list(){
        return ResultEntity.ok(iTypeService.list());
    }
}

