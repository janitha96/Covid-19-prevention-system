package org.api.project.covidApp.controller;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.api.project.covidApp.model.healthStatusModel;
import org.api.project.covidApp.service.healthStatusService;

@Path("/citizenStatus/{nid}")
public class healthstatusController {
	
	healthStatusService service = new healthStatusService();
	
	@PUT
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public healthStatusModel health(@PathParam("nid") String nid, healthStatusModel model) {
		return service.status(nid,model);
		
	}
	

}
