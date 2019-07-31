package com.gd.controller;


import com.alibaba.fastjson.JSONObject;
import com.gd.model.RecommendVo;
import com.gd.model.User;
import com.gd.service.RecommendService;
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
 * 推荐表 前端控制器
 * </p>
 *
 * @author system
 * @since 2019-04-30
 */
@CrossOrigin
@Controller
@RequestMapping("/recommend")
public class RecommendController {

    private static final Logger logger = LoggerFactory.getLogger(RecommendController.class);

    @Autowired
    UserService userService;
    @Autowired
    RecommendService recommendService;

    /**
     * 用于推荐初始化
     *
     * @param username
     * @return
     */
    @RequestMapping("/queryRecommendVoByUserName")
    @ResponseBody
    public String queryRecommendVoByUserName(@RequestParam(value = "username") String username) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("username:{}", username);
            User user = new User();
            user.setUsername(username);
            User userResult = userService.queryUserByUserName(user);
            logger.info("userResult{}" + userResult);
            List<RecommendVo> recommendVos = recommendService.queryRecommendVoByUserId(userResult.getId());
            logger.info("recommendVos{}" + recommendVos);
            if (recommendVos.size() > 0) {
                jsonObject.put("recommendVos", recommendVos);
                jsonObject.put("success", true);
                jsonObject.put("msg", "推荐初始化成功！");
            } else {
                jsonObject.put("success", false);
                jsonObject.put("msg", "推荐里还没有东西呦！");
            }
        } catch (Exception e) {
            logger.error("推荐初始化异常：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "推荐初始化初始化异常！");
        }
        return jsonObject.toJSONString();
    }

}

