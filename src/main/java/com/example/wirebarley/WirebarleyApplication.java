package com.example.wirebarley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class WirebarleyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WirebarleyApplication.class, args);
    }

}
