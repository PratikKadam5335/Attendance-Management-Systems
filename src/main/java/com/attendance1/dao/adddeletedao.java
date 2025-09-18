package com.attendance1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.attendance1.bean.addstudent;

public class adddeletedao {
	
	public boolean adddelete(addstudent as) throws ClassNotFoundException, SQLException {
		

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1","root","root");
		
		PreparedStatement ps=con.prepareStatement("delete from addstudent where name = ?");
		
		
		ps.setString(1, as.getName());
		
		
		int result =ps.executeUpdate();
		
		if(result>0) {
			
			return true;
			
			
			
		}else {
			
			
			return false;
		}
		
	}

}
