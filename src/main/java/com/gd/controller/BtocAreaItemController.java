package com.gd.controller;


import com.alibaba.fastjson.JSONObject;
import com.gd.service.BtocAreaItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author system
 * @since 2019-04-29
 */
@Controller
@RequestMapping("/btocAreaItem")
public class BtocAreaItemController {

    @Autowired
    BtocAreaItemService btocAreaItemService;

    @RequestMapping("/queryProductForVo")
    @ResponseBody
    public String queryProductForVo() {
        return JSONObject.toJSONString(btocAreaItemService.queryProductForVo("999感冒灵"));
    }

}

