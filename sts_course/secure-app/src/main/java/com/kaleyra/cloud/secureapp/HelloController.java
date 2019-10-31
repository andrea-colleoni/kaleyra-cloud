package com.kaleyra.cloud.secureapp;

import java.security.Principal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

	private RestTemplate restTemplate = new RestTemplateBuilder().build();

	@Autowired
	OAuth2ClientContext context;

	@RequestMapping("/")
	public String getHello(Principal principal, Authentication auth) {
		OAuth2AccessToken token = context.getAccessToken();
		Map<String, Object> map = token.getAdditionalInformation();
		map.keySet().stream().forEach(k -> System.out.println(k + ": " + map.get(k)));
		System.out.println(principal.getName());
		System.out.println(auth.getAuthorities());
		System.out.println(auth.getDetails());
		System.out.println(token.getValue());
		token.getScope().stream().forEach(s -> System.out.println(s));

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer " + token.getValue());

		HttpEntity<String> entity = new HttpEntity<String>("", headers);
		ResponseEntity<GithubUser> user = restTemplate.exchange(
				"https://api.github.com/user", HttpMethod.GET, entity, GithubUser.class
				);
		System.out.println(user.getBody());
		return "Secure hello!";
	}
}
