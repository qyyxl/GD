package com.gd.controller;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
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

