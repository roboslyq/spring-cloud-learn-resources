package com.springcloudribbonclient.controller;

import com.springcloudribbonclient.service.FeignServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    FeignServiceDemo feignServiceDemo;

//    @GetMapping(value = "/add")
//    public String add() {
//        return restTemplate.getForEntity("http://SF/", String.class).getBody();
//    }
    @GetMapping(value = "/add1")
    public String add1() {
        return feignServiceDemo.hello();
    }
    @GetMapping(value = "/add2")
    public String add2() {
        return feignServiceDemo.home1();
    }
}