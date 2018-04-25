package com.hebidu.spring.cloud.microserviceproducerhello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @Value("${server.port}")
    private int port;

    @RequestMapping("/hello")
    public String hello() {
        return port + ", hello World";
    }
}
