package org.api.project.covidApp.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.api.project.covidApp.service.registrationService;

public class registrationModel {
	
	private String nic;
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
	private int tel1;
	private int tel2;
	public registrationModel() {
		
	}
	public registrationModel(String nic, String name, int age, String address, double lat, double lon,
			String profession, String email, String affiliation, String password, String status, int tel1, int tel2) {
		super();
		this.nic = nic;
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
		this.tel1 = tel1;
		this.tel2 = tel2;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
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
	public int getTel1() {
		return tel1;
	}
	public void setTel1(int tel1) {
		this.tel1 = tel1;
	}
	public int getTel2() {
		return tel2;
	}
	public void setTel2(int tel2) {
		this.tel2 = tel2;
	}
	
	
	
	
	public boolean validNid() throws Exception {
		registrationService serve1 = new registrationService();
		boolean result1 = serve1.checkNid(this);
		
		return result1;
	}

	public boolean validEmail() throws Exception {
		registrationService serve2 = new registrationService();
		boolean result2 = serve2.checkEmail(this);
		
		return result2;
	}
	
	
	
	

}
