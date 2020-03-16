package com.huyi.porvue.controller;


import com.huyi.porvue.entity.ResultEntity;
import com.huyi.porvue.service.INationService;
import com.huyi.porvue.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 城市字典表 前端控制器
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/nation")
public class NationController {

    @Autowired
    private INationService iNationService;

    @Autowired
    private RedisTemplate redisTemplate;

    //三级联动所有的数据
    @RequestMapping("/list")
    public ResultEntity findAll(){
        return ResultEntity.ok(iNationService.findAll());
    }
}

