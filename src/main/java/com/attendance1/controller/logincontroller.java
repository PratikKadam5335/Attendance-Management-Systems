package com.attendance1.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.attendance1.bean.register;
import com.attendance1.dao.logindao;

/**
 * Servlet implementation class logincontroller
 */
@WebServlet("/logincontroller")
public class logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logincontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		register r = new register();
		r.setEmail(email);
		r.setPassword(password);
		
		logindao ld = new logindao();
		try {
			boolean status =ld.log(r);
			
			if(status == true) {
				
				HttpSession session=request.getSession();
				session.setAttribute("name", r.getName());
				session.setAttribute("image", r.getImage());
				
				
				
				
				RequestDispatcher rrd = request.getRequestDispatcher("index.jsp");
				rrd.forward(request, response);
				
				
			}else {
				RequestDispatcher rrd = request.getRequestDispatcher("login.jsp");
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
