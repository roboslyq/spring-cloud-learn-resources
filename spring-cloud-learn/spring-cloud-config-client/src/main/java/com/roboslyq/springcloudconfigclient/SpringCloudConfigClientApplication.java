package com.roboslyq.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@SpringBootApplication
@EnableScheduling
@RestController
@RefreshScope
public class SpringCloudConfigClientApplication {
	@Autowired
	private ContextRefresher contextRefresher;

	private int count = 0;

	@Scheduled(fixedRate = 100)
	private void refreshedConfig(){
		System.out.println("第" + count++ +"次更新配置");
		Set<String> keys = contextRefresher.refresh();
		System.out.println(keys.toString());
	}

	@Value("${roboslyq.user.name}")
	private String userName;

	@Autowired
	Environment environment;

	@RequestMapping("/getUser")
	public String user() {
        String realTimeUserName = environment.getProperty("roboslyq.user.name");
		return "@valueName = "+userName+"<br/> envName = "+ realTimeUserName ;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
	}

}
