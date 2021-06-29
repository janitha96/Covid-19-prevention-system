package org.api.project.covidApp.controller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.api.project.covidApp.model.citizenDetailsModel;
import org.api.project.covidApp.model.deleteUserModel;
import org.api.project.covidApp.service.deleteUserService;

@Path("/citizenDelete/{nid}")
public class deleteUserController {
	
	deleteUserService service = new deleteUserService();
	
	@DELETE
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public String delete(@PathParam("nid") String nid) {
		return service.deleteUser(nid);
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<citizenDetailsModel> searchdelete(@PathParam("nid") String nid) throws SQLException {
		return service.citizensDetailsByNid(nid);
	}

}
