package com.nagarro.springbootjerseynoxml.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.springbootjerseynoxml.service.GreetingService;

@Path("/greetings")
public class GreetingResource {
	
	private GreetingService greetingService;

	@Autowired
	public GreetingResource(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	@GET
	public String message() {
		return "Hello " + this.greetingService.getMessage();
	}
	

}
