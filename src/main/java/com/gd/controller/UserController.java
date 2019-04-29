package com.gd.controller;


import com.alibaba.fastjson.JSONObject;
import com.gd.dao.UserDao;
import com.gd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author system
 * @since 2019-04-29
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @Autowired
    UserDao userDao;

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUserList() {
        return JSONObject.toJSONString(userDao.selectList(null));
    }

    @RequestMapping("/getUser2")
    @ResponseBody
    public String getUserList2() {
        return JSONObject.toJSONString(userService.queryUserList());
    }
}

