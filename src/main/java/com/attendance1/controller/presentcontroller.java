package com.attendance1.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.attendance1.bean.present;
import com.attendance1.dao.absentdao;
import com.attendance1.dao.presentdao;

/**
 * Servlet implementation class presentcontroller
 */
@WebServlet("/presentcontroller")
public class presentcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public presentcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int mobile = Integer.parseInt(request.getParameter("mobile"));
		
		
		
		present p = new present();
		
		p.setRollno(rollno);
		p.setName(name);
		p.setEmail(email);
		p.setMobile(mobile);
		
		
		
		
		
		
		presentdao pd = new presentdao();
		
		
		try {
			boolean status1 =pd.cheakalready(p);
			
			if(status1 == true) {
				
				RequestDispatcher rrd = request.getRequestDispatcher("addstudentshow.jsp");
				rrd.forward(request, response);
				
				
			}else {
				
			
		try {	
			
			
			
			
			
			boolean cheak =pd.cheakname(p);
			
	
			
			if(cheak == true) {
				
				
				RequestDispatcher rrd = request.getRequestDispatcher("addstudentshow.jsp");
				rrd.forward(request, response);
			}else {
			

			
				boolean status =pd.presentstudent(p);
				
				if(status == true) {
					
					
					
				
				
				
				RequestDispatcher rrd = request.getRequestDispatcher("addstudentshow.jsp");
				rrd.forward(request, response);
				}
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
}	
			
			
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
