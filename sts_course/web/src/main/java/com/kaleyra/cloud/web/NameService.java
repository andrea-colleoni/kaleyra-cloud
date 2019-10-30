package com.kaleyra.cloud.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("name")
public interface NameService {
	
	@RequestMapping("/")
	String getName();
}
