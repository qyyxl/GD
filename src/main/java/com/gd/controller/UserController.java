package com.gd.controller;


import com.alibaba.fastjson.JSONObject;
import com.gd.dao.UserDao;
import com.gd.model.User;
import com.gd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author system
 * @since 2019-04-21
 */
@Controller
@RequestMapping("/user")
@ComponentScan
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUserList() {
        List<User> users = userService.queryUserList();
        return JSONObject.toJSONString(users);
    }

}

