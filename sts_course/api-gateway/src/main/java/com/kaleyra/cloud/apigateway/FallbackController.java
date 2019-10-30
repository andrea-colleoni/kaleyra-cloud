package com.kaleyra.cloud.apigateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {
	
	@RequestMapping("/basic")
	public String basicFallback() {
		return "Servizio non disponibile";
	}

}
