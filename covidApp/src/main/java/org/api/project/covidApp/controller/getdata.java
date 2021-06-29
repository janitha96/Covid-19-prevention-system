package org.api.project.covidApp.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/kk")
public class getdata {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getName() {
		return "hello world";
	}

}
