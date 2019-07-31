package com.gd.ctrip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Common {
    @Autowired
    private A a;


    public void getCreative(String str) {
        if ("thread".equals(str))
            a.getCreative("threac");
        String name = this.getName();
        System.out.println(name + str);
    }

    public String getName() {
        return "common";
    }

}
