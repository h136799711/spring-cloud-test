package com.hebidu.spring.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleCtl {

    @Autowired
    MyHystrixClient myHystrixClient;

    @RequestMapping(value = "/hystrix/simple")
    public String simpleClientCall() {
        return "rsp: " + myHystrixClient.simpleHystrixClientCall(System.currentTimeMillis());
    }

}
