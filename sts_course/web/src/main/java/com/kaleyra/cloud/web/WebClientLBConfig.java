package com.kaleyra.cloud.web;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

@Configuration
public class WebClientLBConfig {
	
	@Bean
	public ILoadBalancer balancer() {
		return new ILoadBalancer() {
			
			@Override
			public void markServerDown(Server server) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public List<Server> getServerList(boolean availableOnly) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Server> getReachableServers() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Server> getAllServers() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Server chooseServer(Object key) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void addServers(List<Server> newServers) {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
