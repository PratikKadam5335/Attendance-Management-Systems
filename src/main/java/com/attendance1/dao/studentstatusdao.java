package com.attendance1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.attendance1.bean.studentstatus;

public class studentstatusdao {
	
	public void status(studentstatus s) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1","root","root");
		
		PreparedStatement ps=con.prepareStatement("insert into studentstatus(rollno,name,email,mobile,status) values(?,?,?,?,?)");
		ps.setInt(1, s.getRollno());
		ps.setString(2,s.getName());
		ps.setString(3, s.getEmail());
		ps.setInt(4, s.getMobile());
		ps.setString(5, s.getStatus());
		
		int a = ps.executeUpdate();
		if(a>0) {
			System.out.println("Insert succesfully");
		}
		else {
			System.out.println("try again");
		}
	}

}
