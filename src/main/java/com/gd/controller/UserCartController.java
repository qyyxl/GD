package com.gd.controller;


import com.alibaba.fastjson.JSONObject;
import com.gd.model.User;
import com.gd.model.UserCart;
import com.gd.service.UserCartService;
import com.gd.service.UserLoveService;
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
 * 我的购物车 前端控制器
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
@CrossOrigin
@Controller
@RequestMapping("/userCart")
public class UserCartController {

    private static final Logger logger = LoggerFactory.getLogger(UserCartController.class);

    @Autowired
    UserCartService userCartService;
    @Autowired
    UserService userService;
    @Autowired
    UserLoveService userLoveService;

    /**
     * 用于购物车界面初始化
     *
     * @param username
     * @return
     */
    @RequestMapping("/queryUserCartByUserName")
    @ResponseBody
    public String queryUserCartByUserName(@RequestParam(value = "username") String username) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("username:{}", username);
            User user = new User();
            user.setUsername(username);
            User userResult = userService.queryUserByUserName(user);
            logger.info("userResult{}" + userResult);
            List<UserCart> userCarts = userCartService.queryUserCartByUserId(userResult.getId());
            logger.info("userCarts{}" + userCarts);
            if (userCarts.size() > 0) {
                jsonObject.put("userCarts", userCarts);
                jsonObject.put("success", true);
                jsonObject.put("msg", "购物车初始化成功！");
            } else {
                jsonObject.put("success", false);
                jsonObject.put("msg", "购物车里还没有东西呦！");
            }
        } catch (Exception e) {
            logger.error("购物车初始化异常：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "购物车初始化初始化异常！");
        }
        return jsonObject.toJSONString();
    }


    /**
     * 用于新增购物车商品
     *
     * @param username
     * @param itemId
     * @param productName
     * @param originalPrice
     * @param orderCount
     * @return
     */
    @RequestMapping("/insertUserCart")
    @ResponseBody
    public String insertUserCart(@RequestParam(value = "username") String username, @RequestParam(value = "itemId") Integer itemId, @RequestParam(value = "productName") String productName, @RequestParam(value = "originalPrice") Double originalPrice, @RequestParam(value = "orderCount") Integer orderCount) {
        JSONObject jsonObject = new JSONObject();
        try {
            Double orderMoney = originalPrice * orderCount;
            logger.info("username:{},itemId:{},productName:{},originalPrice:{},orderCount:{},orderMoney:{}", username, itemId, productName, originalPrice, orderCount, orderMoney);
            User user = new User();
            user.setUsername(username);
            User userResult = userService.queryUserByUserName(user);
            logger.info("userResult{}" + userResult);
            UserCart userCart = new UserCart();
            userCart.setUserId(userResult.getId());
            userCart.setItemId(itemId);
            userCart.setProductName(productName);
            userCart.setOriginalPrice(originalPrice);
            userCart.setOrderCount(orderCount);
            userCart.setOrderMoney(orderMoney);
            boolean flag = userCartService.insertUserCartGuessL(userCart);
            if (flag == true) {
                jsonObject.put("success", true);
                jsonObject.put("msg", "成功添加到购物车！");
            } else {
                jsonObject.put("success", false);
                jsonObject.put("msg", "添加到购物车失败！请重新添加！");
            }
        } catch (Exception e) {
            logger.error("添加到购物车异常：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "添加到购物车异常！");
        }
        return jsonObject.toJSONString();
    }

}

