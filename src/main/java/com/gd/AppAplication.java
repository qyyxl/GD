package com.gd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;


@SpringBootApplication
@ComponentScan("com.gd.*")
@MapperScan("com.gd.dao.*.**")
@EnableScheduling
@Controller
public class AppAplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AppAplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(AppAplication.class, args);
    }

}
