package com.nagarro.springbootjerseynoxml.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.nagarro.springbootjerseynoxml.resource.GreetingResource;

@Component
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		register(GreetingResource.class);
	}

}
