package com.kaleyra.cloud.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("greeting")
public interface GreetingService {
	@RequestMapping("/")
	String getGreeting();
}
