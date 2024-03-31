package com.syzc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xueli
 * @email 2632624281@qq.com
 * @date 2022-04-04 10:31
 * @description
 */
@SpringBootApplication
@MapperScan("com.syzc.repository")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
