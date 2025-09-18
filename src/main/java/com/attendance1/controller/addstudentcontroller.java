package com.attendance1.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.attendance1.bean.addstudent;
import com.attendance1.dao.addstudentdao;

/**
 * Servlet implementation class addstudentcontroller
 */
@WebServlet("/addstudentcontroller")
public class addstudentcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addstudentcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int mobile = Integer.parseInt(request.getParameter("mobile"));
		
		
		addstudent ad = new addstudent();
			ad.setName(name);
			ad.setEmail(email);
			ad.setMobile(mobile);
			
			
		addstudentdao as = new addstudentdao();
		
		
		
		try {
			
			
			
			
			
			
			boolean status =as.add(ad);
			if(status == true) {
				

				RequestDispatcher rrd = request.getRequestDispatcher("addstudent.jsp");
				rrd.forward(request, response);
				
				
				
			}else {
				
				

				RequestDispatcher rrd = request.getRequestDispatcher("addstudent.jsp");
				rrd.forward(request, response);
				
				
			}
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
