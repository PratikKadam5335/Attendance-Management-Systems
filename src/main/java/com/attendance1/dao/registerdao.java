package com.attendance1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.attendance1.bean.register;

public class registerdao {
	public boolean registered(register r) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance1","root","root");
		
		PreparedStatement ps=con.prepareStatement("insert into register(id,name,email,password,confirmpassword,image) values(?,?,?,?,?,?)");
		
		ps.setInt(1, r.getId());
		ps.setString(2, r.getName());
		ps.setString(3, r.getEmail());
		ps.setString(4, r.getPassword());
		ps.setString(5, r.getConfirmpassword());
		ps.setString(6, r.getImage());
		
		int result =ps.executeUpdate();
		if(result>0) {
			System.out.println("regiser");
			return true;
			
			
		}else {
			
			System.out.println("not regiser");
			return false;
		}
		
	}
	

}
