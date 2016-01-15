package com.ces.jerseynoxmlconfig.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/rest/hello")
public class HelloResource {
	
	@GET
	public Response greetings() {
		String str = "Welcome to Book Shop";
		return Response.status(Response.Status.OK).entity(str).build();
	}
}
