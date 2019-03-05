package com.roboslyq.springcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//启用服务发瑞客户端
@EnableDiscoveryClient
@RestController
public class SpringCloudEurekaClientApplication {
	//测试请求使用
	@RequestMapping("/hello")
	public String home() {
		return "Hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientApplication.class, args);
	}

}
