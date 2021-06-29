package org.api.project.covidApp.controller;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.api.project.covidApp.model.registrationModel;
import org.api.project.covidApp.model.userLoginModel;
import org.api.project.covidApp.service.registrationService;

@Path("/citizens")
public class registrationController {
	
	registrationService service = new registrationService(); // create registrationService object
	userLoginModel logger = new userLoginModel();



	@POST  // post method
	@Produces({ MediaType.APPLICATION_JSON }) // data deliver json format and xml
	public registrationModel register1(registrationModel reg) throws Exception {
		if (reg.validNid()) {
			throw new Exception("user Nid is takem");
		}else{
			if (reg.validEmail()) {
				throw new Exception("email taken");
			}else{
				return service.registrationUser(reg);
			}
		}
		//return service.registrationUser(reg);
		
	}
	
	@Path("/login")
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public userLoginModel userLogin(userLoginModel login) throws Exception {
		userLoginModel ob =null;
		if(login.loginValidate()) {
			System.out.print("hello "+login.getNid());
		}else {
			throw new Exception("BAD CREDANTIAL");
		}
		return ob;
		
		
	}

}
