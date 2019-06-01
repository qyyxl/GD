package com.gd.controller;


import com.alibaba.fastjson.JSONObject;
import com.gd.model.ProductVo;
import com.gd.service.BtocAreaItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author system
 * @since 2019-04-29
 */
@CrossOrigin
@Controller
@RequestMapping("/btocAreaItem")
public class BtocAreaItemController {
    private static final Logger logger = LoggerFactory.getLogger(BtocAreaItemController.class);

    @Autowired
    BtocAreaItemService btocAreaItemService;

    /**
     * 用于首页品牌专题展示
     * @return
     */
    @RequestMapping("/queryProductForBrandsVo")
    @ResponseBody
    public String queryProductForBrandsVo() {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("queryProductForBrandsVo start=======");
            String productName = "感冒灵";
            Integer limit = 4;
            List<ProductVo> productVos = btocAreaItemService.queryProductForVo(productName, limit);
            logger.info("productVos::::{}", productVos);
            jsonObject.put("success", true);
            jsonObject.put("data", productVos);
            jsonObject.put("msg", "首页品牌专题展示成功！！！！");
        } catch (Exception e) {
            logger.error("首页品牌专题展示失败：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "首页品牌专题展示失败！！！！");
        }
        return jsonObject.toJSONString();
    }

    /**
     * 用于搜索查询药品
     * @param productName
     * @param request
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping(path = "/queryProductForSearchVo")
    public String queryProductForSearchVo(@RequestParam(value = "productName") String productName, HttpServletRequest request, HttpServletResponse response) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("productName::::{}", productName);
            Integer limit = 100;
            List<ProductVo> productVos = btocAreaItemService.queryProductForVo(productName, limit);
            logger.info("productVos::::{}", productVos);
            jsonObject.put("success", true);
            jsonObject.put("data", productVos);
            jsonObject.put("msg", "搜索查询药品成功！！！！");
        } catch (Exception e) {
            logger.error("搜索查询药品异常：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "搜索查询药品异常！！！！");
        }
        return jsonObject.toJSONString();
    }

    /**
     * 用于商品详情页初始化
     * @param id
     * @param request
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping("/queryProductForDetail")
    public String queryProductForDetail(@RequestParam(value = "id") Integer id, HttpServletRequest request, HttpServletResponse response) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("id========{}", id);
            List<ProductVo> productVos = btocAreaItemService.queryProductForDetail(id);
            logger.info("productVos::::{}", productVos);
            jsonObject.put("success", true);
            jsonObject.put("data", productVos);
            jsonObject.put("msg", "成功！！！！");
        } catch (Exception e) {
            logger.error("失败：：：：{}", e);
            jsonObject.put("success", false);
            jsonObject.put("msg", "失败！！！！");
        }
        return jsonObject.toJSONString();
    }

}

