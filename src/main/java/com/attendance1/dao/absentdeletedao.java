package com.attendance1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.attendance1.bean.absent;


public class absentdeletedao {
	
	
	
	public boolean delete(absent a) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1","root","root");
		
		PreparedStatement ps=con.prepareStatement("delete from absent where email = ?");
		
		ps.setString(1, a.getEmail());
		
		
		int result =ps.executeUpdate();
		if(result>0) {
			
			System.out.println("delete succ");
			return true;
		}else {
			
			System.out.println("delete not succ");
			return false;
			
			
		}
		
		
	}

}
