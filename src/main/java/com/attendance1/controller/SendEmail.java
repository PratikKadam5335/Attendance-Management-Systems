package com.attendance1.controller;



import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
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
import com.attendance1.dao.logindao;

/**
 * Servlet implementation class SendEmail
 */
@WebServlet("/SendEmail")
public class SendEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendEmail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("to") != null) {
		 String to = request.getParameter("to"); 
		
		 
		 
	        String subject = "Otp";
	        Random random = new Random();

	      
	        int otp = 100000 + random.nextInt(900000);

	       
	        String messageText = "Hello! Your OTP is: " + otp;
	        
             HttpSession sess=request.getSession();
             sess.setAttribute("otp", otp);
             sess.setAttribute("email", to);
	        final String from = "kadampratik1081@gmail.com"; 
	        final String password = "mcyb debc rhvm rugr";

	       
	        Properties props = new Properties();
	        props.put("mail.smtp.host", "smtp.gmail.com"); 
	        props.put("mail.smtp.port", "587"); 
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");

	        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
	                return new javax.mail.PasswordAuthentication(from, password);
	            }
	        });
	        

	        try {
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(from));
	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
	            message.setSubject(subject);
	            message.setText(messageText);
	            
	           

	            Transport.send(message);
	         
	            
	            
	           RequestDispatcher rd=request.getRequestDispatcher("verify.jsp");
	           rd.forward(request, response);
	           
	          
	           	            
	        } catch (MessagingException e) {
	            e.printStackTrace();
	            response.getWriter().println("Email sending failed: " + e.getMessage());
	        }
	        
	        
		}else {
			
			int otp=Integer.parseInt(request.getParameter("verify"));
			HttpSession session=request.getSession();
			int otp1=(Integer)session.getAttribute("otp");
			if(otp==otp1) { 
				String email=(String)session.getAttribute("email");
				register r=new register();
				r.setEmail(email);
				logindao ld=new logindao();
				try {
					boolean status=ld.otpLogin(r);
					if(status) {
						
						session.setAttribute("name", r.getName());
						session.setAttribute("image", r.getImage());
						
						
						
						
						RequestDispatcher rrd = request.getRequestDispatcher("index.jsp");
						rrd.forward(request, response);
						
					}else {
						RequestDispatcher rrd = request.getRequestDispatcher("Sendemail.jsp");
						rrd.forward(request, response);
						
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}else {
				RequestDispatcher rrd = request.getRequestDispatcher("Sendemail.jsp");
				rrd.forward(request, response);
				
			}
			
			
		}
	      
	        
		doGet(request, response);
	}

}
