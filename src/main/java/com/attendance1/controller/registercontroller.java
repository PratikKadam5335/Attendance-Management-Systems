package com.attendance1.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;

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
import javax.servlet.http.HttpSession;

import com.attendance1.bean.register;
import com.attendance1.dao.registerdao;

/**
 * Servlet implementation class registercontroller
 */
@WebServlet("/registercontroller")
public class registercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registercontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String image = request.getParameter("image");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("confirmpassword");
		
		
		register r = new register();
		r.setId(id);
		r.setName(name);
		r.setEmail(email);
		r.setPassword(password);
		r.setConfirmpassword(confirmpassword);
		r.setImage(image);
		
		registerdao rd = new registerdao();
		try {
			boolean status =rd.registered(r);
			if(status == true) {
				
				 
				 
			        String subject = "Register-Success";
			      

			       
			        String messageText = "Registration Successfully!...";
			        
		            
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
							message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(r.getEmail()));
				            message.setSubject(subject);
				            message.setText(messageText);
				            Transport.send(message);
					         
							RequestDispatcher rrd = request.getRequestDispatcher("login.jsp");
							rrd.forward(request, response);
						} catch (AddressException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (MessagingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			            
			            
			           

			           
			        
				
			}else {
				
				RequestDispatcher rrd = request.getRequestDispatcher("register.jsp");
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
