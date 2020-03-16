package com.huyi.porvue.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.ProductVo;
import com.huyi.porvue.entity.ResultEntity;
import com.huyi.porvue.service.IProductMiddleService;
import com.huyi.porvue.service.IPromotionService;
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
 * @since 2020-03-13
 */
@RestController
@RequestMapping("/promotion")
public class PromotionController {

    @Autowired
    private IPromotionService iPromotionService;


    @RequestMapping("/list")
    public ResultEntity list(){
        return ResultEntity.ok(iPromotionService.list());
    }
}

