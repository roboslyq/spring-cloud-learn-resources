package com.springcloudribbonclient.controller;

import com.springcloudribbonclient.service.FeignServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    //注入接口
    @Autowired
    private FeignServiceDemo feignServiceDemo;

    @GetMapping(value = "/hello1")
    public String hello1() {
        String result = feignServiceDemo.hello1();
        System.out.println("feigh:"+result);
        return  result;
    }
}