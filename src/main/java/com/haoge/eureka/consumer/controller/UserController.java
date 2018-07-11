package com.haoge.eureka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
//测试地址  http://localhost:8200/buy?name=zhangsan
	@Autowired
	RestTemplate restTemplate;
	@GetMapping("buy")
	public String buy(String name) {
		
		String s = restTemplate.getForObject("http://provider-ticket/ticket", String.class);
		return name+"购买了"+s;
	}
}
