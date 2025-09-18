<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>
 * {
      box-sizing: border-box;
      margin: 0;
      padding: 0;
    }

    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: #f4f6f8;
      color: #333;
    }

    /* Header Styles */
    header {
      background-color: #10a37f;
      padding: 1rem 2rem;
      display: flex;
      justify-content: space-between;
      align-items: center;
      color: #fff;
    }

    .logo {
      font-size: 1.5rem;
      font-weight: bold;
    }

    nav a {
      color: #fff;
      text-decoration: none;
      margin: 0 1rem;
      font-size: 1rem;
    }

    nav a:hover {
      text-decoration: underline;
    }

    .avatar {
      width: 40px;
      height: 40px;
      border-radius: 50%;
      background-color: #fff;
      display: flex;
      align-items: center;
      justify-content: center;
      color: #10a37f;
      font-weight: bold;
      font-size: 1rem;
    }

    /* Main Content Styles */
    main {
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      padding: 4rem 2rem;
      text-align: center;
    }

    .button-container {
      display: flex;
      flex-wrap: wrap;
      justify-content: center;
      gap: 1rem;
      margin-top: 2rem;
    }

    .action-button {
      padding: 1rem 2rem;
      background-color: #10a37f;
      color: #fff;
      border: none;
      border-radius: 8px;
      font-size: 1rem;
      cursor: pointer;
      transition: background-color 0.3s ease;
      min-width: 200px;
    }

    .action-button:hover {
      background-color: #0e8c6e;
    }

    @media (max-width: 768px) {
      .action-button {
        width: 100%;
        max-width: 300px;
      }
    }





</style>
<header>
    <div class="logo">Attendance System</div>
    
    	
    	<%String name=(String)session.getAttribute("name"); 
    	String image=(String)session.getAttribute("image"); 
					if(name != null){%>
		<nav>
    			 <a href="homepage.jsp">Home</a>
     			 <a href="logoutcontroller">Logout</a>
      		 	 <a href=""><%=name %></a>
   		</nav>
   			 
   		     <div class="avatar">
   		
    	<img style=" width: 40px; height: 40px; border-radius: 50%;background-color: #fff; display: flex;align-items: center;justify-content: center;color: #10a37f;
      font-weight: bold;
      font-size: 1rem;"  src="images/<%=image%>">
      
   			 </div>
  
    			
				<% 	}else{
					%>
					
					
					<div class="logo">Attendance System</div>
					<a href="homepage.jsp">Home</a>
       				<a href="register.jsp">Register</a>
     				 <a href="login.jsp">Login</a>
      
   
    
					
		`			<div class="avatar">A</div>	
				
					<%} %>
    
  </header>
  




</body>
</html>