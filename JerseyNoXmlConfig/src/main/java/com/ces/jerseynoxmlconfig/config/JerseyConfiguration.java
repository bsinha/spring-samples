package com.ces.jerseynoxmlconfig.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.ces.jerseynoxmlconfig.resource.HelloResource;

@Component
public class JerseyConfiguration extends ResourceConfig {
	
	public JerseyConfiguration() {
		register(HelloResource.class);
	}
	

}
