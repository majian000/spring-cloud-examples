package com.majian.spring.cloud.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaGatewayApplication.class, args);
    }
}