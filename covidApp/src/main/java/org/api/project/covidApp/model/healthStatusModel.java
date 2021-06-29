package org.api.project.covidApp.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class healthStatusModel {
	
//	private String nid;
	private String status;
	
	public healthStatusModel() {
		
	}

	public healthStatusModel(String status) {
		super();
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
