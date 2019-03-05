package com.springcloudribbonclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SF")
public interface FeignServiceDemo {
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    String hello();

    @RequestMapping(value = "/home1", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    String home1();
}
