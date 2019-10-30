package com.kaleyra.cloud.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGatewayApplication {
	// https://cloud.spring.io/spring-cloud-gateway/multi/multi__actuator_api.html
	
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("r1", r ->
//					r.host("localhost", "127.0.0.1")
//					.and()
					r.path("/greeting/")
					.uri("http://localhost:8081")
				)
				.build();
	}

}
