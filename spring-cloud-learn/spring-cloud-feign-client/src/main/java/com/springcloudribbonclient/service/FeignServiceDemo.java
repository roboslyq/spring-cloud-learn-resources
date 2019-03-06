package com.springcloudribbonclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//Feign注解，value为服务提供者的serviceId
@FeignClient(value = "SPRING-CLOUD-EUREKA-CLIENT")
public interface FeignServiceDemo {
    //配置服务提供者的URI及相关参数，此注解与SpringMVC通用
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    String hello1();
}
