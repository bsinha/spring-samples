/*
 * Copyright@ CES. 2015 
 */
package com.ces.springbootjerseynoxml.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	public String getMessage() {
		return "World!!!";
	}

}
