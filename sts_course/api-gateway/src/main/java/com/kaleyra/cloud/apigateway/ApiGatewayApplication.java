package com.kaleyra.cloud.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
@EnableEurekaClient
public class ApiGatewayApplication {
	// https://cloud.spring.io/spring-cloud-gateway/multi/multi__actuator_api.html

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	/*
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes().route("r1", r ->
//					r.host("localhost", "127.0.0.1")
//					.and()
					r
					.path("/greeting")
					.or()
					.path("/name")
					.filters(f -> f.rewritePath("/greeting(?<segment>.*)", "${segment}"))
					.uri("http://127.0.0.1:8081"))
				.build();
	}
	*/
}
