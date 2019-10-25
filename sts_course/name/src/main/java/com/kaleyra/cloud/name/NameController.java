package com.kaleyra.cloud.name;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
	private static final Logger LOG = Logger.getLogger(NameController.class.getName());
	
	@Autowired
	private NameProperties nameProperties;

	@RequestMapping("/")
	public String getName() {
		LOG.info("get name => " + nameProperties.getName());
		return nameProperties.getName();
	}
}
