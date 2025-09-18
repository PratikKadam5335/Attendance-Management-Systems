package com.attendance1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.attendance1.bean.register;



public class logindao {

	public boolean log(register r) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1", "root", "root");
		
		PreparedStatement ps=con.prepareStatement("select * from register where email=? and password=?");
		
		ps.setString(1, r.getEmail());
		ps.setString(2, r.getPassword());
		
		
		
		
		ResultSet rs =ps.executeQuery();	
			
		if(rs.next()) {
			
			r.setName(rs.getString(2));
			r.setImage(rs.getString(6));
			
			
			return true;
		}else {
			
			return false;
			
			
		}
			
		
		
		
		
	}
	
public boolean otpLogin(register r) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1", "root", "root");
		
		PreparedStatement ps=con.prepareStatement("select * from register where email=?");
		
		ps.setString(1, r.getEmail());
		
		
		
		
		
		ResultSet rs =ps.executeQuery();	
		
			
		if(rs.next()) {
			
			r.setName(rs.getString(2));
			r.setImage(rs.getString(6));
			
			
			
			
			return true;
		}else {
			
			return false;
			
			
		}
			
		
	
}
	
}
