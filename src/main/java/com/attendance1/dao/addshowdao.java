package com.attendance1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.attendance1.bean.addstudent;

public class addshowdao {

	public ArrayList<addstudent> show() throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1", "root", "root");	
		
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select * from addstudent");
		
		ArrayList<addstudent> arr = new ArrayList<addstudent>();
		
		while(rs.next()) {
			
			addstudent as = new addstudent(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			arr.add(as);
		}
		return arr;
		
	}
	
	
	
}
