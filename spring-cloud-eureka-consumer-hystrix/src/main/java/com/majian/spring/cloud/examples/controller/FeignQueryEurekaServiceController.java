package com.majian.spring.cloud.examples.controller;

import com.majian.spring.cloud.examples.service.FeignServerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用Feign方式
 * 查询Eureka注册中心的服务
 */
@RestController
@RequestMapping("/feignQueryEurekaService")
public class FeignQueryEurekaServiceController {

    @Autowired
    private FeignServerInfoService feignServerInfoService;

    @GetMapping("/server_info/port")
    public String queryPort() {
        return "feign方式调用服务端返回:"+feignServerInfoService.queryServerPort();
    }

}
