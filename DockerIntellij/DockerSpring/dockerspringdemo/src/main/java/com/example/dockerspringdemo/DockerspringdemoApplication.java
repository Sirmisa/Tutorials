package com.example.dockerspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DockerspringdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerspringdemoApplication.class, args);
    }

}
