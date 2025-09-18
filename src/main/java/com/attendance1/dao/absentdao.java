package com.attendance1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.attendance1.bean.absent;
import com.attendance1.bean.present;



public class absentdao {

public boolean absentstudent(absent a) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1","root","root");
		
		PreparedStatement ps=con.prepareStatement("insert into absent(rollno,name,email,mobile) values(?,?,?,?)");
		
		ps.setInt(1, a.getRollno());
		ps.setString(2, a.getName());
		ps.setString(3, a.getEmail());
		ps.setInt(4, a.getMobile());
		
		int result =ps.executeUpdate();		
		
		if(result>0) {
			System.out.println("go");
			return true;
			
			
		}else {
			
			System.out.println("not go");
			return false;
		}
	}	
		
	
	public boolean cheakname(absent a) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1","root","root");
		
		PreparedStatement ps=con.prepareStatement("select * from absent where name = ?");
		
		
		ps.setString(1, a.getName());
		
		
		ResultSet cheak= ps.executeQuery();
		
		if(cheak.next()) {
			
			System.out.println("already register this email");
			return true;
		}else {
			
			System.out.println("notexist");
			return false;
		}
	
	}
	
	
	
public boolean cheakalready1(absent a) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1","root","root");
		
		PreparedStatement ps=con.prepareStatement("select * from present where name = ?");
		
		ps.setString(1, a.getName());
		
		ResultSet cheak1 = ps.executeQuery();
		
		if(cheak1.next() ) {
			System.out.println("already present");
			return true;
			
			
			
		}else {
			
			
			return false;
			
			
		}
		
		
		
		
	}
	
	
	
	
	}	
	
	
	
	

