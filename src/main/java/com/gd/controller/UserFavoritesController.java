package com.gd.controller;


import com.alibaba.fastjson.JSONObject;
import com.gd.model.User;
import com.gd.model.UserFavorites;
import com.gd.model.UserFavoritesVo;
import com.gd.service.UserFavoritesService;
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
 * 我的收藏夹 前端控制器
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
@CrossOrigin
@Controller
@RequestMapping("/userFavorites")
public class UserFavoritesController {
    private static final Logger logger = LoggerFactory.getLogger(UserFavoritesController.class);

    @Autowired
    UserFavoritesService userFavoritesService;
    @Autowired
    UserService userService;

    /**
     * 用于收藏夹初始化
     *
     * @param username
     * @return
     */
    @RequestMapping("/queryUserFavoritesByUserName")
    @ResponseBody
    public String queryUserFavoritesByUserName(@RequestParam(value = "username") String username) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("username:{}", username);
            User user = new User();
            user.setUsername(username);
            User userResult = userService.queryUserByUserName(user);
            logger.info("userResult{}" + userResult);
            List<UserFavoritesVo> userFavoritesVos = userFavoritesService.queryUserFavoritesByUserId(userResult.getId());
            logger.info("userFavoritesVos{}" + userFavoritesVos);
            if (userFavoritesVos.size() > 0) {
                jsonObject.put("userFavoritesVos", userFavoritesVos);
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
     * 用于添加到收藏夹
     *
     * @param username
     * @param itemId
     * @param productName
     * @return
     */
    @RequestMapping("/insertUserFavorites")
    @ResponseBody
    public String insertUserFavorites(@RequestParam(value = "username") String username, @RequestParam(value = "itemId") Integer itemId, @RequestParam(value = "productName") String productName) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("username:{},itemId:{},productName:{}", username, itemId, productName);
            User user = new User();
            user.setUsername(username);
            User userResult = userService.queryUserByUserName(user);
            logger.info("userResult{}" + userResult);
            UserFavorites userFavorites = new UserFavorites();
            userFavorites.setUserId(userResult.getId());
            userFavorites.setItemId(itemId);
            userFavorites.setProductName(productName);
            boolean flag = userFavoritesService.insertUserFavoritesGuessL(userFavorites);
            if (flag == true) {
                jsonObject.put("success", true);
                jsonObject.put("msg", "成功添加到收藏夹！");
            } else {
                jsonObject.put("success", false);
                jsonObject.put("msg", "添加到收藏夹失败！请重新添加！");
            }
        } catch (Exception e) {
            logger.error("添加到收藏夹异常：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "添加到收藏夹异常！");
        }
        return jsonObject.toJSONString();
    }
}

