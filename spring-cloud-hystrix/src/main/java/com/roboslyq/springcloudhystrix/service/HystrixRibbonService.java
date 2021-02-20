package com.roboslyq.springcloudhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HystrixRibbonService {
    @Autowired
    private RestTemplate restTemplate;

    //指定服务失败回调方法
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello() {
        String result = restTemplate.getForEntity("http://SPRING-CLOUD-SERVER-DEMO/hello", String.class).getBody();
        System.out.println(result);
        return  result;
    }

    public String helloError(){
        return "hello world is error!!!";
    }
}
