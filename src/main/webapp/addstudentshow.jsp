<%@page import="com.attendance1.bean.addstudent"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<a href = "index.jsp">index</a>

<style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f6f8;
      padding: 40px;
    }

    .admin-table {
      width: 100%;
      border-collapse: collapse;
      background-color: #fff;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
      border-radius: 10px;
      overflow: hidden;
    }

    .admin-table thead {
      background-color: #2d6cdf;
      color: #fff;
    }

    .admin-table th, .admin-table td {
      padding: 15px;
      text-align: left;
      border-bottom: 1px solid #eaeaea;
    }

    .admin-table tr:hover {
      background-color: #f1f1f1;
    }

    .action-btn {
      padding: 5px 10px;
      border: none;
      border-radius: 5px;
      margin-right: 5px;
      cursor: pointer;
    }

    .edit-btn {
      background-color: #4CAF50;
      color: white;
    }

    .delete-btn {
      background-color: #f44336;
      color: white;
    }
    
    
   
    .button {
      background-color: #4CAF50; /* Green */
      border: none;
      color: white;
      padding: 15px 30px;
      text-align: center;
      font-size: 16px;
      border-radius: 8px;
    
    }

    .clicked {
      background-color: #2196F3; /* Blue */
    }
  
    
  </style>
<table class ="admin-table">
	<thead>
	<tr>
	<th>rollno</th>
	<th>Name</th>
	<th>email</th>
	<th>phone</th>
	<th>present</th>
	<th>absent</th>
	<th>delete</th>
	<th>update</th>
	
	 
	
	</tr>
	</thead>
	<tbody>
	
	
	
	<%ArrayList<addstudent> arr= (ArrayList)session.getAttribute("student"); 
	
	for(addstudent as:arr){
	%>
	<tr>
	<td><%=as.getRollno()%></td>
	<td><%=as.getName()%></td>
	<td><%=as.getEmail()%></td>
	<td><%=as.getMobile()%></td>
	
	
			
			
			<td>
			
			<form action="presentcontroller" method="get">
			
					<input type="hidden" name="rollno" value="<%=as.getRollno()%>">
					<input type="hidden" name="name" value="<%=as.getName()%>">
					<input type="hidden" name="email" value="<%=as.getEmail()%>">
					<input type="hidden" name="mobile" value="<%=as.getMobile()%>">
					
					<button class="button">present</button>
				
					
					
			</form>
		
		</td>
		
		<td>
			<form action="absentcontroller" method="get">
			<input type="hidden" name="rollno" value="<%=as.getRollno()%>">
					<input type="hidden" name="name" value="<%=as.getName()%>">
					<input type="hidden" name="email" value="<%=as.getEmail()%>">
					<input type="hidden" name="mobile" value="<%=as.getMobile()%>">
					
					
					<button class="button">absent</button>
					
					
			</form>
			</td>
			
			
			<td>
			
			<form action="adddeletecontroller" method="get">
			
					
					<input type="hidden" name="name" value="<%=as.getName()%>">
					
					
					<button class="button" onclick = "window.location.reload()">Delete</button>
				
					
					
			</form>
		
		</td>
			
			
			<td>
			
	
					
					<a href = "addupdate.jsp"><button class="button">update</button></a>
			
		
		</td>
			
			
			
			
			
	</tr>
	
	<script>
    function changeColor(element) {
      element.classList.toggle('clicked');
    }
    
 
  
  </script>

<%} %>
</body>
	
	</table>
	

	




</body>
</html>