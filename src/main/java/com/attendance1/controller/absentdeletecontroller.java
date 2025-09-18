package com.attendance1.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.attendance1.bean.absent;
import com.attendance1.dao.absentdeletedao;

/**
 * Servlet implementation class absentdeletecontroller
 */
@WebServlet("/absentdeletecontroller")
public class absentdeletecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public absentdeletecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String email = request.getParameter("email");
		
		absent a = new absent();
		a.setEmail(email);
		
		absentdeletedao add = new absentdeletedao();
		try {
			boolean status =add.delete(a);
			
			
			if(status == true) {
				
				RequestDispatcher rs=request.getRequestDispatcher("absentshow.jsp");
				rs.forward(request, response);
				
				
			}else {
				
				
				RequestDispatcher rs=request.getRequestDispatcher("absentshow.jsp");
				rs.forward(request, response);
				
				
				
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
