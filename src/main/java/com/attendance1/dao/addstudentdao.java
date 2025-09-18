package com.attendance1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.attendance1.bean.addstudent;

public class addstudentdao {

	public boolean add(addstudent ad) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1","root","root");
		
		PreparedStatement ps=con.prepareStatement("insert into addstudent(name,email,mobile) values(?,?,?)");
		
		ps.setString(1, ad.getName());
		ps.setString(2, ad.getEmail());
		ps.setInt(3, ad.getMobile());
		
		int result =ps.executeUpdate();
		
		if(result>0) {
			
			System.out.println("add succ");
			return true;
		}else {
			
			System.out.println("not add");
			return false;
		}
		
		
		
		
	}
	
	

		
		
		
		
	}
	
	
	
	
	
	
	

