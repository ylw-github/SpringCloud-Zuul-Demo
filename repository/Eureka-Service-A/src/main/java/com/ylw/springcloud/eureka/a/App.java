package com.ylw.springcloud.eureka.a;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
