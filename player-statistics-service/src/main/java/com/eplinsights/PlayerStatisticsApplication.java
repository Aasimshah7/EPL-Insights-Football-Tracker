package com.eplinsights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PlayerStatisticsApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlayerStatisticsApplication.class, args);
    }
}