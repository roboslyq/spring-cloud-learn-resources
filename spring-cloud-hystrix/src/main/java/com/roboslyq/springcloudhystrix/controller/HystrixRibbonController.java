package com.roboslyq.springcloudhystrix.controller;

import com.roboslyq.springcloudhystrix.service.HystrixRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixRibbonController {
    @Autowired
    HystrixRibbonService hystrixRibbonService;

    @GetMapping("/hello")
    public String hello(){
        return hystrixRibbonService.hello();
    }
}
