package com.roboslyq.springcloudeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//启用服务发瑞客户端
@EnableDiscoveryClient
@RestController
public class ServiceProviderApplication {
	@Value("${server.port}")
	private int serverPort;
	//测试请求使用
	@RequestMapping(value ="/hello",method = RequestMethod.GET)
	public String home() {
		return  "hello:" + serverPort;
	}
	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderApplication.class, args);
	}

}
