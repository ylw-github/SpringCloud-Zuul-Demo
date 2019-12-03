package com.ylw.springcloud.eureka.a;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping("/getInfo")
    public String getOrder() {
        return "我是A服务的getInfo";
    }
}
