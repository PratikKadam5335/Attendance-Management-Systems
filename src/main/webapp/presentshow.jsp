<%@page import="com.attendance1.bean.present"%>
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
    
  </style>
<table class ="admin-table">
	<thead>
	<tr>
	<th>rollno</th>
	<th>Name</th>
	<th>email</th>
	<th>phone</th>
	<th>delete</th>
	
	
	</tr>
	</thead>
	<tbody>
	
	
	<button>refresh
	<%
  response.setIntHeader("Refresh", 5);
%>
</button>
	<%ArrayList<present> arr= (ArrayList)session.getAttribute("presentstudent"); 
	
	for(present p:arr){
	%>
	<tr>
	<td><%=p.getRollno()%></td>
	<td><%=p.getName()%></td>
	<td><%=p.getEmail()%></td>
	<td><%=p.getMobile()%></td>
	<td>
	<form action="presentdeletecontroller" method="get">
					<input type="hidden" name="name" value="<%=p.getName()%>">
					<button type="submit" onclick="window.location.reload()">delete data</button>
			</form>
	</td>
		

<%} %>
</body>
	
	</table>
	
	

</body>
</html>