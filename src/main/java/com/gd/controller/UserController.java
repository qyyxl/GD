package com.gd.controller;


import com.alibaba.fastjson.JSONObject;
import com.gd.dao.UserDao;
import com.gd.model.User;
import com.gd.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author system
 * @since 2019-05-08
 */
@CrossOrigin
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUserList() {
        return JSONObject.toJSONString(userService.queryUserList());
    }

    /**
     * 用于注册新用户
     * @param username
     * @param tell
     * @param password
     * @return
     */
    @RequestMapping("/insertUserForSign")
    @ResponseBody
    public String insertUserForSign(@RequestParam(value = "username") String username,@RequestParam(value = "tell") String tell, @RequestParam(value = "password") String password) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("username:{},tell:{},password:{}", username,tell, password);
            User user = new User();
            user.setUsername(username);
            user.setTell(tell);
            user.setPassword(password);
            boolean flag = userService.insertUserGuessL(user);
            if (flag == true) {
                jsonObject.put("success", true);
                jsonObject.put("msg", "注册成功！请登录好药网");
            } else {
                jsonObject.put("success", false);
                jsonObject.put("msg", "注册失败！请重新注册！");
            }
        } catch (Exception e) {
            logger.error("注册异常：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "注册异常！");
        }
        return jsonObject.toJSONString();
    }

    /**
     * 用于个人信息修改
     * @param id
     * @param username
     * @param gender
     * @param email
     * @param tell
     * @return
     */
    @RequestMapping("/updateUser")
    @ResponseBody
    public String updateUser(@RequestParam(value = "id") Integer id,@RequestParam(value = "username") String username,@RequestParam(value = "gender") Integer gender,@RequestParam(value = "email") String email,@RequestParam(value = "tell") String tell) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("id:{},username:{},gender:{},email{},tell:{}",id, username,gender,email,tell);
            User user = new User();
            user.setId(id);
            user.setUsername(username);
            user.setGender(gender);
            user.setEmail(email);
            user.setTell(tell);
            boolean flag = userService.updateUserGuessL(user);
            if (flag == true) {
                jsonObject.put("success", true);
                jsonObject.put("msg", "个人信息更新成功！");
            } else {
                jsonObject.put("success", false);
                jsonObject.put("msg", "个人信息更新失败！请重新修改！");
            }
        } catch (Exception e) {
            logger.error("个人信息更新异常：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "个人信息更新异常！");
        }
        return jsonObject.toJSONString();
    }

    /**
     * 检查是否存在此用户用于登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/checkUserForRegistered")
    @ResponseBody
    public String checkUserForRegistered(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("username:{},password:{}", username, password);
            boolean flag = userService.checkUserForRegistered(username, password);
            if (flag == true) {
                jsonObject.put("success", true);
                jsonObject.put("msg", "登录成功！");
            } else {
                jsonObject.put("success", false);
                jsonObject.put("msg", "用户名或密码错误,请重新输入！");
            }
        } catch (Exception e) {
            logger.error("登录异常：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "登录异常！");
        }
        return jsonObject.toJSONString();
    }


    /**
     * 用于个人信息界面初始化
     * @param username
     * @return
     */
    @RequestMapping("/queryUser")
    @ResponseBody
    public String queryUser(@RequestParam(value = "username") String username) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("username:{}", username);
            User user = new User();
            user.setUsername(username);
            User userResult = userService.queryUserByUserName(user);
            if (userResult != null) {
                jsonObject.put("userInfo", userResult);
                jsonObject.put("success", true);
                jsonObject.put("msg", "个人信息初始化成功！");
            } else {
                jsonObject.put("success", false);
                jsonObject.put("msg", "个人信息初始化失败！");
            }
        } catch (Exception e) {
            logger.error("查询异常：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "个人信息初始化异常！");
        }
        return jsonObject.toJSONString();
    }
}

