package org.api.project.covidApp.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class citizenDetailsModel {
	
	private String nid;
	private String name;
	private int age;
	private String address;
	private double lat;
	private double lon;
	private String profession;
	private String email;
	private String affiliation;
	private String password;
	private String status;
	
	public citizenDetailsModel() {
	
	}
	
	public citizenDetailsModel(String nid, String name, int age, String address, double lat, double lon,
			String profession, String email, String affiliation, String password, String status) {
		super();
		this.nid = nid;
		this.name = name;
		this.age = age;
		this.address = address;
		this.lat = lat;
		this.lon = lon;
		this.profession = profession;
		this.email = email;
		this.affiliation = affiliation;
		this.password = password;
		this.status = status;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
