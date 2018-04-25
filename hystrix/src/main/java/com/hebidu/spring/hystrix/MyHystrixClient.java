package com.hebidu.spring.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyHystrixClient {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "myFallback")
    public String simpleHystrixClientCall(long time) {
        String url = "http://MICROSERVICE-PRODUCER-HELLO/hello";
        return restTemplate.getForObject(url, String.class);
    }

    /**
     * 方法simpleHystrixClientCall的回退方法，可以指定将hystrix执行失败异常传入到方法中
     *
     * @param p ystrix执行失败的传入方法的请求
     * @param e hystrix执行失败的异常对象
     * @return
     */
    String myFallback(long p, Throwable e) {
        return "Execute raw fallback: access service fail , req= " + p + " reason = " + e;
    }


}
