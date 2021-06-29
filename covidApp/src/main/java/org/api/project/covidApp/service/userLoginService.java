package org.api.project.covidApp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.api.project.covidApp.model.userLoginModel;

public class userLoginService {
		Connection con;
	public userLoginService() {
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
	
	public boolean login(userLoginModel log) throws SQLException {
		
		boolean result = false;
		
		String select ="select * from signup where nid=? and pwd=?";
		PreparedStatement ps = con.prepareStatement(select);
		ps.setString(1, log.getNid());
		ps.setString(2, log.getPwd());
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			
			result=true;
			
		}else {
			result = false;
		}
		
		
		return result;
		
	}

}
