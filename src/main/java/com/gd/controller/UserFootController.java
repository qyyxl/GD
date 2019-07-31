package com.gd.controller;


import com.alibaba.fastjson.JSONObject;
import com.gd.model.User;
import com.gd.model.UserFoot;
import com.gd.model.UserFootVo;
import com.gd.service.UserFootService;
import com.gd.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 我的足迹 前端控制器
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
@CrossOrigin
@Controller
@RequestMapping("/userFoot")
public class UserFootController {
    private static final Logger logger = LoggerFactory.getLogger(UserFootController.class);

    @Autowired
    UserService userService;
    @Autowired
    UserFootService userFootService;


    /**
     * 用于我的足迹初始化
     *
     * @param username
     * @return
     */
    @RequestMapping("/queryUserFootByUserName")
    @ResponseBody
    public String queryUserFootByUserName(@RequestParam(value = "username") String username) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("username:{}", username);
            User user = new User();
            user.setUsername(username);
            User userResult = userService.queryUserByUserName(user);
            logger.info("userResult{}" + userResult);
            List<UserFootVo> userFootVos = userFootService.queryUserFootByUserId(userResult.getId());
            logger.info("userFootVos{}" + userFootVos);
            if (userFootVos.size() > 0) {
                jsonObject.put("userFootVos", userFootVos);
                jsonObject.put("success", true);
                jsonObject.put("msg", "收藏夹初始化成功！");
            } else {
                jsonObject.put("success", false);
                jsonObject.put("msg", "收藏夹里还没有东西呦！");
            }
        } catch (Exception e) {
            logger.error("收藏夹初始化异常：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "收藏夹初始化初始化异常！");
        }
        return jsonObject.toJSONString();
    }

    /**
     * 用于添加到我的足迹
     *
     * @param username
     * @param itemId
     * @param productName
     * @return
     */
    @RequestMapping("/insertUserFoot")
    @ResponseBody
    public String insertUserFoot(@RequestParam(value = "username") String username, @RequestParam(value = "itemId") Integer itemId, @RequestParam(value = "productName") String productName) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("username:{},itemId:{},productName:{}", username, itemId, productName);
            User user = new User();
            user.setUsername(username);
            User userResult = userService.queryUserByUserName(user);
            logger.info("userResult{}" + userResult);
            UserFoot userFoot = new UserFoot();
            userFoot.setUserId(userResult.getId());
            userFoot.setItemId(itemId);
            userFoot.setProductName(productName);
            boolean flag = userFootService.insertUserFootGuessL(userFoot);
            if (flag == true) {
                jsonObject.put("success", true);
                jsonObject.put("msg", "成功添加到我的足迹！");
            } else {
                jsonObject.put("success", false);
                jsonObject.put("msg", "添加到我的足迹失败！请重新添加！");
            }
        } catch (Exception e) {
            logger.error("添加到我的足迹异常：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "添加到我的足迹异常！");
        }
        return jsonObject.toJSONString();
    }

}

