package org.api.project.covidApp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.api.project.covidApp.model.registrationModel;

public class registrationService {
	
	Connection con;
	
	public registrationService() {
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
	
	public boolean checkNid(registrationModel checkUname) throws SQLException {
		boolean result = false;
		String select= "select * from signup where nid= ?";
		PreparedStatement st = con.prepareStatement(select);
		st.setString(1, checkUname.getNic());
		ResultSet rs = st.executeQuery();
        if(rs.next()){
        	 result= true;
        	
        }else{
            result= false;
          
        }
		
		return result;
	}
	
	public boolean checkEmail(registrationModel checkEmail) throws SQLException {
		boolean result = false;
		String select= "select * from signup where email= ? ";
		PreparedStatement st = con.prepareStatement(select);
		st.setString(1, checkEmail.getEmail());
		ResultSet rs = st.executeQuery();
        if(rs.next()){
        	 result= true;
        	
        }else{
            result= false;
        }
		
		return result;
	}
	
	public registrationModel registrationUser(registrationModel model) throws SQLException {
		
	
		try {
			String insert = "insert into signup(nid,name,age,address,profession,email,affiliation,pwd,status,lat,lon,tel1,tel2) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, model.getNic());
			ps.setString(2, model.getName());
			ps.setLong(3, model.getAge());
			ps.setString(4, model.getAddress());
			ps.setString(5, model.getProfession());
			ps.setString(6, model.getEmail());
			ps.setString(7, model.getAffiliation());
			ps.setString(8, model.getPassword());
			ps.setString(9, model.getStatus());
			ps.setDouble(10, model.getLat());
			ps.setDouble(11, model.getLon());
			ps.setLong(12, model.getTel1());
			ps.setLong(13, model.getTel2());
//			ps.executeUpdate();
			if(ps.executeUpdate()==1) {
				try {
					
					String loca = "insert into locations(nid,lat,lon) values(?,?,?)";
					PreparedStatement ps2 = con.prepareStatement(loca);
					ps2.setString(1, model.getNic());
					ps2.setDouble(2, model.getLat());
					ps2.setDouble(3, model.getLon());

//					ps2.executeUpdate();
					if(ps2.executeUpdate()==1) {
						try {
							
							String health = "insert into health(nid,status) values(?,?)";
							PreparedStatement ps3 = con.prepareStatement(health);
							ps3.setString(1, model.getNic());
							ps3.setString(2, model.getStatus());
						

							ps3.executeUpdate();
							
							
						}catch(Exception e) {
							System.out.print(e);
						}
					}
					
				}catch(Exception e) {
					System.out.print(e);
				}
				
			}
			
			
		}catch(Exception e) {
			System.out.print(e);
		}
		
		
		
		
		return model;
		
	}

}
