package com.attendance1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.attendance1.bean.addstudent;

public class updatestudentdao {

	public boolean update(addstudent ad) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1","root","root");
		
		PreparedStatement ps=con.prepareStatement("update addstudent set rollno = ? where rollno = ?");
		
		ps.setString(1, ad.getName());
		ps.setInt(2, ad.getRollno());
		
		
		
		int status =ps.executeUpdate();
		if(status>0) {
			
			System.out.println("update succ");
			return true;
			
		}else {
			System.out.println("update not  succ");
			return false;
			
		}
		
		
	}
	
	
	
	
	
	
	
	
}
