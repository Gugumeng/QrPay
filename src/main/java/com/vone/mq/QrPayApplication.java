package com.vone.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class QrPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(QrPayApplication.class, args);
    }

}

