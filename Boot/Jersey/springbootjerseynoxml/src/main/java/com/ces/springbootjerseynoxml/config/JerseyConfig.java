/*
 * Copyright@ CES. 2015 
 */
package com.ces.springbootjerseynoxml.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.ces.springbootjerseynoxml.resource.GreetingResource;

@Component
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		register(GreetingResource.class);
	}

}
