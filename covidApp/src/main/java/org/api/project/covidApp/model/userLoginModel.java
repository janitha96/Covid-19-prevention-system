package org.api.project.covidApp.model;

import java.sql.SQLException;

import javax.xml.bind.annotation.XmlRootElement;

import org.api.project.covidApp.service.userLoginService;
@XmlRootElement
public class userLoginModel {
	
	private String nid;
	private String pwd;
	
	public userLoginModel() {
		
	}
	
	public userLoginModel(String nid, String pwd) {
		super();
		this.nid = nid;
		this.pwd = pwd;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public boolean loginValidate() throws SQLException {
		
		userLoginService service = new userLoginService();
		boolean valid = service.login(this);
		return valid;
	}
	

}
