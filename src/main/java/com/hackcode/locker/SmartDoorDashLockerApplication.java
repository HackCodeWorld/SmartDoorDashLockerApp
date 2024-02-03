package com.hackcode.locker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication： 这个注解表明这是一个 Spring Boot 应用。它会自动扫描当前包和子包中的所有组件，并将它们注册到 Spring 上下文中。
 */
@SpringBootApplication
public class SmartDoorDashLockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartDoorDashLockerApplication.class, args);
    }

}
