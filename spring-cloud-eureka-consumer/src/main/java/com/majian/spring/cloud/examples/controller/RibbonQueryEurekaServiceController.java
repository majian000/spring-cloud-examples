package com.majian.spring.cloud.examples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 使用Ribbon方式
 * 查询Eureka注册中心的服务
 */
@RestController
@RequestMapping("/ribbonQueryEurekaService")
public class RibbonQueryEurekaServiceController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/server_info/port")
    public String queryPort() {
        String result = restTemplate.getForObject("http://spring-cloud-eureka-service/server_info/port",String.class);
        return result;
    }

}
