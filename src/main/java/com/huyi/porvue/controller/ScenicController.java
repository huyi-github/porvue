package com.huyi.porvue.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.ResultEntity;
import com.huyi.porvue.entity.Scenic;
import com.huyi.porvue.entity.ScenicVo;
import com.huyi.porvue.service.IScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huyi
 * @since 2020-03-14
 */
@RestController
@RequestMapping("/scenic")
public class ScenicController {
    @Autowired
    private IScenicService iScenicService;

    @RequestMapping("/list")
    public ResultEntity list(@RequestParam(defaultValue = "1")long current,
                             @RequestParam(defaultValue = "3")long size, ScenicVo vo){
        Page page = new Page(current, size);
        IPage ipage = iScenicService.findAll(page,vo);
        return ResultEntity.ok(ipage);
    }

    @RequestMapping("/insert")
    public ResultEntity insert(@RequestBody Scenic scenic){
        boolean save = iScenicService.save(scenic);
        return ResultEntity.ok(save);
    }

    @RequestMapping("/update")
    public ResultEntity update(@RequestBody Scenic scenic){
        boolean update = iScenicService.updateById(scenic);
        return ResultEntity.ok(update);
    }

    @RequestMapping("/delete")
    public ResultEntity delete(Integer id){
        boolean delete = iScenicService.removeById(id);
        return ResultEntity.ok(delete);
    }
}

