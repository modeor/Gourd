package com.gourd.gourdbase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.gourd.gourdbase.dao")
public class GourdBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(GourdBaseApplication.class, args);
    }

}
