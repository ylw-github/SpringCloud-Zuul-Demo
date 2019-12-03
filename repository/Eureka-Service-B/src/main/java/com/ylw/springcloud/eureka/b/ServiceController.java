package com.ylw.springcloud.eureka.b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceController {

    @RequestMapping("/getInfo")
    public String getOrder() {
        return "我是B服务的getInfo";
    }
}
