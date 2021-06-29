package org.api.project.covidApp.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class citizensLocationUpModel {
	
	private String nid;
	private double lat;
	private double lon;
	//private String location;
	
	public citizensLocationUpModel() {
		
	}
	
	
	public citizensLocationUpModel(String nid, double lat, double lon) {
		super();
		this.nid = nid;
		this.lat = lat;
		this.lon = lon;
	//	this.location = location;
	}


	public String getNid() {
		return nid;
	}


	public void setNid(String nid) {
		this.nid = nid;
	}


	public double getLat() {
		return lat;
	}


	public void setLat(double lat) {
		this.lat = lat;
	}


	public double getLon() {
		return lon;
	}


	public void setLon(double lon) {
		this.lon = lon;
	}


//	public String getLocation() {
//		return location;
//	}
//
//
//	public void setLocation(String location) {
//		this.location = location;
//	}
	
	
	

}
