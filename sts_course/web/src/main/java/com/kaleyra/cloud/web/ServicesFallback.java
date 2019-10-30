package com.kaleyra.cloud.web;

import org.springframework.stereotype.Component;

@Component
public class ServicesFallback implements GreetingService, NameService {

	@Override
	public String getName() {
		return "Servizio name non disponibile";
	}

	@Override
	public String getGreeting() {
		return "Servizio greet non disponibile";
	}

}
