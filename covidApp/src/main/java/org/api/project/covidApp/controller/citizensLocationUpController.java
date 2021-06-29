package org.api.project.covidApp.controller;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.api.project.covidApp.model.citizensLocationUpModel;
import org.api.project.covidApp.service.citizensLocationUpService;

@Path("/citizensLocations/nid/{nid}")
public class citizensLocationUpController {
	
	citizensLocationUpService service = new citizensLocationUpService();
	@PUT
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public citizensLocationUpModel updateLocation(@PathParam("nid") String nid,citizensLocationUpModel model) {
		return service.location(nid,model);
		
	}

}
