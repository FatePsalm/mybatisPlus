package com.solace.mybatisselect;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.solace.mybatisselect.mapper")
public class MyBatisSelectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisSelectApplication.class, args);
    }
}
