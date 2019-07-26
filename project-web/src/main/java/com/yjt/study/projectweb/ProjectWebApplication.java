package com.yjt.study.projectweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.yjt.study"})
//解决无法注入mapper的问题
@MapperScan("com.yjt.study.projectdao.mapper")
public class ProjectWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectWebApplication.class, args);
    }

}
