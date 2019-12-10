package com.why.boot_controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.why")
public class BootControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootControllerApplication.class, args);
    }

}
