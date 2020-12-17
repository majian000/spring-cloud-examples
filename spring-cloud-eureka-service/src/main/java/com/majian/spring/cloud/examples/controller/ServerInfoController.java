package com.majian.spring.cloud.examples.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 返回這個台服務器端口號等信息
 */
@RestController
@RequestMapping("/server_info")
public class ServerInfoController {

    @Value("${server.port}")
    private String port;


    @RequestMapping("/port")
    public String queryPort(){
        return "server port is "+port;
    }
}
