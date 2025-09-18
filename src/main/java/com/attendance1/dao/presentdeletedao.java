package com.attendance1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.attendance1.bean.present;

public class presentdeletedao {

	public boolean presentdelete(present p) throws ClassNotFoundException, SQLException {
		
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1","root","root");
		
		PreparedStatement ps=con.prepareStatement("delete from present where name = ?");
		
		ps.setString(1, p.getName());
		
		int result = ps.executeUpdate();
		
		if(result > 0) {
			
			
			System.out.println("delete succ");
			return true;
			
			
		}else {
			
			System.out.println("delete not succ");
			return false;
			
		}
		
		
		
		
	}
	
	
	
	
	
}
