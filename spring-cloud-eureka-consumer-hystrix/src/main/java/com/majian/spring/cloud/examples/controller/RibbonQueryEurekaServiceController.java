package com.majian.spring.cloud.examples.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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

    /**
     * 配置熔断超时时间为1秒,如果1秒服务不返回将发生熔断
     * @return
     */
    @GetMapping("/server_info/port")
    @HystrixCommand(fallbackMethod = "queryPortException", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
    })
    public String queryPort() {
        String result = restTemplate.getForObject("http://spring-cloud-eureka-service/server_info/port", String.class);
        return "Ribbon方式调用 服务端返回:" + result;
    }


    public String queryPortException() {
        return "访问spring-cloud-eureka-service服务时间过长,强制取消访问";
    }
}
