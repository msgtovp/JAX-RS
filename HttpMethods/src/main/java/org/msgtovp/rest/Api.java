package org.msgtovp.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class Api {

	@GET
	@Produces("text/plain")
	public String getMessage() {
		return "Hi! Message from GET Method (/)";
	}

	@POST
	@Produces("text/plain")
	public String postMessage() {
		return "Hi! Message from POST Method (/)";
	}

	@PUT
	@Produces("text/plain")
	public String putMessage() {
		return "Hi! Message from PUT Method (/)";
	}

	@DELETE
	@Produces("text/plain")
	public String deleteMessage() {
		return "Hi! Message from DELETE Method (/)";
	}

}
