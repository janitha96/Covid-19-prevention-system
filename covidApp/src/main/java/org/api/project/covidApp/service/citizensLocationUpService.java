package org.api.project.covidApp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.api.project.covidApp.model.citizensLocationUpModel;

public class citizensLocationUpService {
	
	Connection con;
	
	public citizensLocationUpService() {
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
	
	
	public citizensLocationUpModel location(String nid, citizensLocationUpModel mod) {
		
		String update = "update locations set lat=? , lon=? where nid=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(update);
			ps.setDouble(1, mod.getLat());
			ps.setDouble(2, mod.getLon());
			ps.setString(3, nid);
			ps.executeUpdate();
		
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return mod;
		
	}

}
