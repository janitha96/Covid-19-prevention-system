package org.api.project.covidApp.controller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.api.project.covidApp.model.citizenDetailsModel;
import org.api.project.covidApp.service.citizenDetailsService;

@Path("/citizensDetails/nid")
public class citizensDetailsController {
	
	citizenDetailsService service = new citizenDetailsService();
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<citizenDetailsModel> getCitizensDetails(@PathParam("nid") String nid) throws SQLException{
		return service.citizensDetails();
		
	}
	
	@Path("contact/{contact}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<citizenDetailsModel> getCitizensDetailsByNid(@PathParam("contact") int contact) throws SQLException{
		return service.citizensDetailsByContacts(contact);
		
	}
	
	@Path("/{nid}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<citizenDetailsModel> getCitizensDetailsByNid(@PathParam("nid") String nid) throws SQLException{
		return service.citizensDetailsByNid(nid);
		
	}
	

}
