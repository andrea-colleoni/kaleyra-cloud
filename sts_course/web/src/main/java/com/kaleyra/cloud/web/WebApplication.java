package com.kaleyra.cloud.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
	
	// in quest'applicazione questo bean è superfluo perché
	// uso i feign clients (non ho bisogno del restTemplate)
	/*
	@Configuration
	static class AppConfig {
		@Bean
		public RestTemplate rest() {
			return new RestTemplateBuilder().build();
		}
	}
	*/
}
