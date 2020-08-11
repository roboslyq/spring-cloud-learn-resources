package com.roboslyq.springcloud.ribbon.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudRibbonClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRibbonClientApplication.class, args);
	}

}
