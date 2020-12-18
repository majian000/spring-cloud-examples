package com.majian.spring.cloud.examples.service;

import com.majian.spring.cloud.examples.service.impl.FeignServerInfoServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "spring-cloud-eureka-service",fallback = FeignServerInfoServiceFallbackImpl.class)
public interface FeignServerInfoService {

    @GetMapping("/server_info/port")
    public String queryServerPort();
}
