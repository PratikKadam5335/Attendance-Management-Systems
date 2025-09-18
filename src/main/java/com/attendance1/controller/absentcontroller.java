package com.attendance1.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.attendance1.bean.absent;

import com.attendance1.dao.absentdao;

/**
 * Servlet implementation class absentcontroller
 */
@WebServlet("/absentcontroller")
public class absentcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public absentcontroller() {
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
		
		
		
		absent a = new absent();
		
		a.setRollno(rollno);
		a.setName(name);
		a.setEmail(email);
		a.setMobile(mobile);
		
		
		
		absentdao ad = new absentdao();
		
		try {
			boolean status1 =ad.cheakalready1(a);
			
			
			
			if(status1 == true) {
				RequestDispatcher rrd = request.getRequestDispatcher("addstudentshow.jsp");
				rrd.forward(request, response);
				
			}else {
				
						
		try {	
			
						
			
			boolean cheak =ad.cheakname(a);
	
			
			if(cheak == true) {
				
				
			            
				
				
				RequestDispatcher rrd = request.getRequestDispatcher("addstudentshow.jsp");
				rrd.forward(request, response);
			}else {
			

			
				boolean status =ad.absentstudent(a);
				
				if(status == true) {
					
					 String subject = "Absent Student";
				      

				       
				        String messageText = "You are indisciplined student in this collage.You Come tommarrow with your parents...!"
				        		+ "Message From HOD....";
				        
			            
				        final String from = "kadampratik1081@gmail.com"; 
				        final String pass = "mcyb debc rhvm rugr";

				       
				        Properties props = new Properties();
				        props.put("mail.smtp.host", "smtp.gmail.com"); 
				        props.put("mail.smtp.port", "587"); 
				        props.put("mail.smtp.auth", "true");
				        props.put("mail.smtp.starttls.enable", "true");

				        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
				            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				                return new javax.mail.PasswordAuthentication(from, pass);
				            }
				        });
				        

				            Message message = new MimeMessage(session);
				            try {
								message.setFrom(new InternetAddress(from));
								message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(a.getEmail()));
					            message.setSubject(subject);
					            message.setText(messageText);
					            Transport.send(message);
						         
								RequestDispatcher rrd = request.getRequestDispatcher("addstudentshow.jsp");
								rrd.forward(request, response);
							} catch (AddressException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (MessagingException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				            	
					
				
				
				
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
