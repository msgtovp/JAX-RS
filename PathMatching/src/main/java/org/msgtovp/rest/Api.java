package org.msgtovp.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class Api {

	@GET
	@Produces("text/plain")
	public String getIt() {
		return "Hi! Welcome to REST API (/)";
	}
	
	@GET
	@Produces("text/plain")
	@Path("/guest")
	public String getGuest() {
		return "Hi! Welcome to REST API - This is from Guest Method (/guest)";
	}
	
	@GET
	@Produces("text/plain")
	@Path("/user")
	public String getUser() {
		return "Hi! Welcome to REST API - This is from User Method (/user)";
	}
	
}
