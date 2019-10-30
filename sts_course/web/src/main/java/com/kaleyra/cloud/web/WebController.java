package com.kaleyra.cloud.web;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	private static final Logger LOG = Logger.getLogger(WebController.class.getName());
	
	@Autowired
	private GreetingService greetingService;
	@Autowired
	private NameService nameService;
	
	@RequestMapping("/web")
	public String index() {
		String _res = new StringBuilder()
				.append(greetingService.getGreeting())
				.append(" ")
				.append(nameService.getName())
				.toString();
		LOG.info("get index => " + _res);
		return _res;
	}

}
