package com.kaleyra.cloud.greeting;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
	private static final Logger LOG = Logger.getLogger(GreetingController.class.getName());
	
	@Autowired
	private GreetingProperties greetingProperties;
	
	@RequestMapping("/")
	public String getGreeting() {
		LOG.info("get greeting => " + greetingProperties.getGreeting());
		return greetingProperties.getGreeting();
	}

}
