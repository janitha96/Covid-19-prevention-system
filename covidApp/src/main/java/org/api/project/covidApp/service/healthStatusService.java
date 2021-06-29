package org.api.project.covidApp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.api.project.covidApp.model.healthStatusModel;

public class healthStatusService {
	Connection con;
	public healthStatusService() {
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
	
	public healthStatusModel status(String nid,healthStatusModel loc) {
		
		
		
		String update = "update signup set status=? where nid=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(update);
			ps.setString(1, loc.getStatus());
			ps.setString(2, nid);
			ps.setString(1, loc.getStatus());
			
			
			if(ps.executeUpdate()==1) {
				try {
					String updateHealth = "update health set status=? where nid=?";
					PreparedStatement ps2 = con.prepareStatement(updateHealth);
					ps2.setString(1, loc.getStatus());
					ps2.setString(2, nid);
					ps2.setString(1, loc.getStatus());
					
					ps2.executeUpdate();
					if(ps.executeUpdate()==1) {
						
					}
				
					
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return loc;
		
	}

}
