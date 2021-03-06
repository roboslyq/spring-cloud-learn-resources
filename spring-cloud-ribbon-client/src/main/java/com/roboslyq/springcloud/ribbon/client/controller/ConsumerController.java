package com.roboslyq.springcloud.ribbon.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/hello")
    public String hello() {
        String result = restTemplate.getForEntity("http://SPRING-CLOUD-SERVER-DEMO/hello", String.class).getBody();
        System.out.println(result);
        return  result;
    }
}