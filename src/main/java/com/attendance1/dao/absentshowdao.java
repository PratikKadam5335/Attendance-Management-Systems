package com.attendance1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.attendance1.bean.absent;

public class absentshowdao {
	
	

		
		public ArrayList<absent> absentshow() throws ClassNotFoundException, SQLException {
			
			
			
	Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1", "root", "root");	
			
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("select * from absent");
			
			ArrayList<absent> arr = new ArrayList<absent>();
			
			while(rs.next()) {
				
				arr.add( new absent(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
				
				
				
			}
			return arr;
			
			
		}
	

}
