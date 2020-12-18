package com.majian.spring.cloud.examples.service.impl;

import com.majian.spring.cloud.examples.service.FeignServerInfoService;
import org.springframework.stereotype.Component;

@Component
public class FeignServerInfoServiceFallbackImpl implements FeignServerInfoService {
    @Override
    public String queryServerPort() {
        return "Feign调用spring-cloud-eureka-service服务超时 发生熔断";
    }
}
