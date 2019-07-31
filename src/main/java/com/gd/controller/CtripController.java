package com.gd.controller;

import com.gd.ctrip.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/ctrip")
@ComponentScan
public class CtripController {

    @Autowired
    private B b;

    @RequestMapping("test")
    public String test(){
        b.getCreative("thread");
        return "success";
    }


}
