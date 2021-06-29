package org.api.project.covidApp.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class deleteUserModel {
	
	private String nid;
	
	public deleteUserModel() {
		
	}


	public deleteUserModel(String nid) {
		super();
		this.nid = nid;
	}


	public String getNid() {
		return nid;
	}


	public void setNid(String nid) {
		this.nid = nid;
	}


	
}
