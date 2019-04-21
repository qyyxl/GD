package com.gd.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class WebConfig {

    @Value("${server.port}")
    public String port;

}
