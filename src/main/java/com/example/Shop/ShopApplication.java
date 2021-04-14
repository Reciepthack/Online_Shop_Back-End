package com.example.Shop;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class ShopApplication {

    public static void main(String[] args) {
        log.info("Starting app");
        SpringApplication.run(ShopApplication.class, args);
        log.info("app started");
    }
}
