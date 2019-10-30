package com.kaleyra.cloud.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@FeignClient(name = "greeting", fallback = ServicesFallback.class)
public interface GreetingService {
	
	@RequestMapping("/")
	String getGreeting();
}
