package com.huyi.porvue.controller;


import com.huyi.porvue.entity.ResultEntity;
import com.huyi.porvue.entity.User;
import com.huyi.porvue.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huyi
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private IMenuService iMenuService;

    @RequestMapping("/list")
    public ResultEntity list(){
        return ResultEntity.ok(iMenuService.listMenus());
    }

    @RequestMapping("/listByUserName")
    public ResultEntity listByUserName(HttpServletRequest request, @RequestParam(defaultValue = "lisi")String userName){
        User user = (User) request.getSession().getAttribute("user");
        System.out.println(request.getSession());
        if(user!=null){
            userName = user.getUsername();
        }
        return ResultEntity.ok(iMenuService.listByUserName(userName));
    }
}

