package com.kiki.kikistore.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.kiki.kikistore.product.dao")
@SpringBootApplication
public class KikistoreProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(KikistoreProductApplication.class, args);
    }

}
