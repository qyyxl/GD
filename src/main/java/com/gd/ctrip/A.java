package com.gd.ctrip;

import org.springframework.stereotype.Service;

@Service
public class A extends Common {


    @Override
    public void getCreative(String str){
        String name = this.getName();
        System.out.println("A"+ name + str);
    }



}
