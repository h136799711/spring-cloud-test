package com.hebidu.spring.cloud.microserviceconsumerhello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/call")
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        String url = "http://MICROSERVICE-PRODUCER-HELLO/hello";
        return restTemplate.getForObject(url, String.class);
    }
}
