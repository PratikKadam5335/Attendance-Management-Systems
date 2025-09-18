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
import com.attendance1.bean.studentstatus;
import com.attendance1.dao.presentdao;
import com.attendance1.dao.studentstatusdao;

/**
 * Servlet implementation class studentstatuscontroller
 */
@WebServlet("/studentstatuscontroller")
public class studentstatuscontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentstatuscontroller() {
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
		String status = request.getParameter("status");
		
		
		
		studentstatus s = new studentstatus();
		
		s.setRollno(rollno);
		s.setName(name);
		s.setEmail(email);
		s.setMobile(mobile);
		s.setStatus(status);
		
		
		
		studentstatusdao pd = new studentstatusdao();
		try {
			pd.status(s);
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
