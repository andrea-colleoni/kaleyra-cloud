package com.kaleyra.cloud.greeting;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties()
public class GreetingProperties {
	
	String greeting;

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getGreeting() {
		return this.greeting;
	}
	
}
