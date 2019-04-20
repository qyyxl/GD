package com.gd.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ComponentScan
@RequestMapping("/root")
public class HelloController {

 /* @Autowired
    private WebConfig webConfig;*/

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "Hello world!";
    }


}
