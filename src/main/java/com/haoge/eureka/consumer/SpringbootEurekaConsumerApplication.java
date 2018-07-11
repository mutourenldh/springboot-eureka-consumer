package com.haoge.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient    //开启服务发现的功能
@SpringBootApplication
public class SpringbootEurekaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEurekaConsumerApplication.class, args);
	}
	
	//使用RestTemplate进行远程服务调用
	@Bean
	@LoadBalanced//允许使用负载均衡机制
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
