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
import com.attendance1.dao.presentdeletedao;

/**
 * Servlet implementation class presentdeletecontroller
 */
@WebServlet("/presentdeletecontroller")
public class presentdeletecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public presentdeletecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String name = request.getParameter("name");
		
		
		present p = new present();
		
		p.setName(name);
		
		presentdeletedao pdd = new presentdeletedao();
		
				try {
					boolean status =pdd.presentdelete(p);
					
					if(status == true) {
						
						
						RequestDispatcher rrd = request.getRequestDispatcher("presentshow.jsp");
						rrd.forward(request, response);
					}else {
						
						
						RequestDispatcher rrd = request.getRequestDispatcher("presentshow.jsp");
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
