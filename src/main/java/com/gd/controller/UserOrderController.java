package com.gd.controller;


import com.alibaba.fastjson.JSONObject;
import com.gd.model.User;
import com.gd.model.UserOrder;
import com.gd.service.UserOrderService;
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
 * 我的订单 前端控制器
 * </p>
 *
 * @author system
 * @since 2019-05-10
 */
@CrossOrigin
@Controller
@RequestMapping("/userOrder")
public class UserOrderController {

    private static final Logger logger = LoggerFactory.getLogger(UserOrderController.class);

    @Autowired
    UserOrderService userOrderService;
    @Autowired
    UserService userService;


    /**
     * 用于购物车界面初始化
     *
     * @param username
     * @return
     */
    @RequestMapping("/queryUserOrderByUserName")
    @ResponseBody
    public String queryUserOrderByUserName(@RequestParam(value = "username") String username) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("username:{}", username);
            User user = new User();
            user.setUsername(username);
            User userResult = userService.queryUserByUserName(user);
            logger.info("userResult{}" + userResult);
            List<UserOrder> userOrders = userOrderService.queryUserOrderByUserId(userResult.getId());
            logger.info("userOrders{}" + userOrders);
            if (userOrders.size() > 0) {
                jsonObject.put("userOrders", userOrders);
                jsonObject.put("success", true);
                jsonObject.put("msg", "我的订单初始化成功！");
            } else {
                jsonObject.put("success", false);
                jsonObject.put("msg", "我的订单还没有东西呦！");
            }
        } catch (Exception e) {
            logger.error("购物车初始化异常：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "购物车初始化初始化异常！");
        }
        return jsonObject.toJSONString();
    }


    /**
     * 用于支付，新增我的订单商品
     *
     * @param username
     * @param itemId
     * @param productName
     * @param originalPrice
     * @param orderCount
     * @return
     */
    @RequestMapping("/insertUserOrder")
    @ResponseBody
    public String insertUserOrder(@RequestParam(value = "username") String username, @RequestParam(value = "itemId") Integer itemId, @RequestParam(value = "productName") String productName, @RequestParam(value = "originalPrice") Double originalPrice, @RequestParam(value = "orderCount") Integer orderCount) {
        JSONObject jsonObject = new JSONObject();
        try {
            Double orderMoney = originalPrice * orderCount;
            logger.info("username:{},itemId:{},productName:{},originalPrice:{},orderCount:{},orderMoney:{}", username, itemId, productName, originalPrice, orderCount, orderMoney);
            User user = new User();
            user.setUsername(username);
            User userResult = userService.queryUserByUserName(user);
            logger.info("userResult{}" + userResult);
            UserOrder userOrder = new UserOrder();
            userOrder.setUserId(userResult.getId());
            userOrder.setItemId(itemId);
            userOrder.setProductName(productName);
            userOrder.setOriginalPrice(originalPrice);
            userOrder.setOrderCount(orderCount);
            userOrder.setOrderMoney(orderMoney);
            boolean flag = userOrderService.insertUserOrderGuessL(userOrder);
            if (flag == true) {
                jsonObject.put("success", true);
                jsonObject.put("msg", "支付成功！可在我的订单查看！");
            } else {
                jsonObject.put("success", false);
                jsonObject.put("msg", "支付失败！请重新支付！");
            }
        } catch (Exception e) {
            logger.error("支付异常：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "支付异常！请重新支付！");
        }
        return jsonObject.toJSONString();
    }

}

