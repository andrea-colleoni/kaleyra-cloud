package com.kaleyra.cloud.web;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@Service
public class GreetingService {
	private static final Logger LOG = Logger.getLogger(GreetingService.class.getName());
	
	@Autowired
	private RestTemplate rest;
	
	@Autowired
	private EurekaClient discoveryClient;
	
	public String getGreeting() {
		InstanceInfo instance = discoveryClient.getNextServerFromEureka("GREETING", false);
		LOG.info(instance.getHomePageUrl());
		return rest.getForObject(instance.getHomePageUrl(), String.class);
	}
}
