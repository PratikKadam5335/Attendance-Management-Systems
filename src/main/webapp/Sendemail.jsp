
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%if(session.getAttribute("Email")!=null){ %>
<script>alert("Email Send Successfully!..");</script>
<%} %>
<form action="SendEmail" method="post">

<input type="email" name="to">
<button type="submit">Send OTP</button>


</form>
</body>
</html>