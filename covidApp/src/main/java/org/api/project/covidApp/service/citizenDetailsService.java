package org.api.project.covidApp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.api.project.covidApp.model.citizenDetailsModel;

public class citizenDetailsService {
	Connection con;
	
	public citizenDetailsService() {
		try {

			String url= String.format("jdbc:mysql://localhost:3306/api");
			String uName="root";
			String pwd ="";
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url, uName, pwd);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public ArrayList<citizenDetailsModel> citizensDetails() throws SQLException{
		ArrayList <citizenDetailsModel> model = new ArrayList<citizenDetailsModel>();
		
		String select = "select * from signup";
		PreparedStatement ps = con.prepareStatement(select);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			citizenDetailsModel ob= new citizenDetailsModel();
			ob.setNid(rs.getString("nid"));
			ob.setName(rs.getString("name"));
			ob.setAge(rs.getInt("age"));
			ob.setAddress(rs.getString("address"));
			ob.setProfession(rs.getString("profession"));
			ob.setEmail(rs.getString("email"));
			ob.setAffiliation(rs.getString("affiliation"));
			ob.setStatus(rs.getString("status"));
			ob.setLat(rs.getDouble("lat"));
			ob.setLon(rs.getDouble("lon"));
			
			model.add(ob);
			
			
		}
		return model;
		
	}
	
	
	
	public ArrayList<citizenDetailsModel> citizensDetailsByNid(String nid) throws SQLException{
		ArrayList <citizenDetailsModel> model = new ArrayList<citizenDetailsModel>();
		
		String select = "select * from signup where nid=?";
		PreparedStatement ps = con.prepareStatement(select);
		ps.setString(1, nid);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			citizenDetailsModel ob= new citizenDetailsModel();
			ob.setNid(rs.getString("nid"));
			ob.setName(rs.getString("name"));
			ob.setAge(rs.getInt("age"));
			ob.setAddress(rs.getString("address"));
			ob.setProfession(rs.getString("profession"));
			ob.setEmail(rs.getString("email"));
			ob.setAffiliation(rs.getString("affiliation"));
			ob.setStatus(rs.getString("status"));
			ob.setLat(rs.getDouble("lat"));
			ob.setLon(rs.getDouble("lon"));
			
			model.add(ob);
			
			
		}
		return model;
		
	}
	
	public ArrayList<citizenDetailsModel> citizensDetailsByContacts(int contact) throws SQLException{
		ArrayList <citizenDetailsModel> model = new ArrayList<citizenDetailsModel>();
		
		String select = "select * from signup where tel1=?";
		PreparedStatement ps = con.prepareStatement(select);
		ps.setLong(1, contact);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			citizenDetailsModel ob= new citizenDetailsModel();
			ob.setNid(rs.getString("nid"));
			ob.setName(rs.getString("name"));
			ob.setAge(rs.getInt("age"));
			ob.setAddress(rs.getString("address"));
			ob.setProfession(rs.getString("profession"));
			ob.setEmail(rs.getString("email"));
			ob.setAffiliation(rs.getString("affiliation"));
			ob.setStatus(rs.getString("status"));
			ob.setLat(rs.getDouble("lat"));
			ob.setLon(rs.getDouble("lon"));
			
			model.add(ob);
			
			
		}
		return model;
		
	}

}
