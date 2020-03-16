package com.huyi.porvue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.Product;
import com.huyi.porvue.entity.ProductVo;
import com.huyi.porvue.entity.ResultEntity;
import com.huyi.porvue.service.IProductMiddleService;
import com.huyi.porvue.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Query;
import java.util.Arrays;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huyi
 * @since 2020-03-13
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;
    @Autowired
    private IProductMiddleService iProductMiddleService;


    @RequestMapping("/list")
    public ResultEntity list(@RequestParam(defaultValue = "1") long current,
                             @RequestParam(defaultValue = "4") long size, ProductVo vo){
        Page page = new Page(current, size);
        IPage iPage = iProductService.selectPageVo(page, vo);
        return ResultEntity.ok(iPage);
    }

    @RequestMapping("/deletes")
    public ResultEntity deletes(Integer [] ids){
       for (Integer id:ids){
           QueryWrapper wrapper = new QueryWrapper();
           wrapper.eq("pid",id);
           iProductMiddleService.remove(wrapper);
       }
        boolean b = iProductService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(b);
    }

    @RequestMapping("/delete")
    public ResultEntity delete(Integer id){

        boolean b = iProductService.removeById(id);
        return ResultEntity.ok(b);
    }

    @RequestMapping("/insert")
    public ResultEntity insert(@RequestBody Product product){
       // product.setCreated(new Date("2020-03-14"));
        boolean b = iProductService.save(product);
        return ResultEntity.ok(b);
    }

    @RequestMapping("/update")
    public ResultEntity update(@RequestBody Product product){

        boolean b = iProductService.updateById(product);
        return ResultEntity.ok(b);
    }
}

