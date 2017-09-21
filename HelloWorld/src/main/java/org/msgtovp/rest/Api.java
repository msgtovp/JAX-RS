package org.msgtovp.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class Api {

	@GET
	@Produces("text/plain")
	public String getIt() {
		return "Hi! Welcome to REST API";
	}
	
}
