package com.huyi.porvue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.ResultEntity;
import com.huyi.porvue.entity.User;
import com.huyi.porvue.entity.UserVo;
import com.huyi.porvue.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
@RequestMapping("/user")
//解决跨域问题
@CrossOrigin
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/list")
    public ResultEntity userList(@RequestParam(defaultValue = "1")long current,
                                 @RequestParam(defaultValue = "5")long size,UserVo userVo){
        Page page = new Page(current, size);
        IPage<User> pageInfo = iUserService.selectPageVo(page,userVo);
        return ResultEntity.ok(pageInfo);
    }

    @RequestMapping("/delete")
    public ResultEntity delete(Integer [] ids){
        boolean flag = iUserService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(flag);
    }

    @RequestMapping("/deleteId")
    public ResultEntity delete(Integer  id){
        boolean flag = iUserService.removeById(id);
        return ResultEntity.ok(flag);
    }

    @RequestMapping("/insert")
    public ResultEntity insert(@RequestBody User user){
        boolean flag = iUserService.save(user);
        return ResultEntity.ok(flag);
    }

    @RequestMapping("/update")
    public ResultEntity update(@RequestBody User user){
        boolean flag = iUserService.updateById(user);
        return ResultEntity.ok(flag);
    }

    @RequestMapping("/login")
    public ResultEntity login(HttpServletRequest request,String username, String password){
        HttpSession session = request.getSession();
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username",username);
        User user = iUserService.getOne(wrapper);

        if(user!=null){
            if(user.getPassword().equals(password)){
                session.setAttribute("user",user);
                return ResultEntity.ok(user);
            }
        }
        return ResultEntity.error(500,"用户名或者密码错误");
    }

    @RequestMapping("/loginout")
    public ResultEntity loginout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return ResultEntity.ok(true);
    }

}

