<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<head>
  <meta charset="UTF-8">
  <title>Student Registration</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f0f2f5;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }
    .form-container {
      background-color: #fff;
      padding: 30px 40px;
      border-radius: 8px;
      box-shadow: 0 4px 8px rgba(0,0,0,0.1);
      width: 350px;
    }
    .form-container h2 {
      text-align: center;
      margin-bottom: 20px;
    }
    label {
      display: block;
      margin-top: 15px;
      font-weight: bold;
    }
    input[type="text"],
    input[type="email"],
    input[type="tel"] {
      width: 100%;
      padding: 10px;
      margin-top: 5px;
      border: 1px solid #ccc;
      border-radius: 4px;
    }
    input[type="submit"] {
      width: 100%;
      padding: 12px;
      margin-top: 20px;
      background-color: #4CAF50;
      color: white;
      border: none;
      border-radius: 4px;
      font-size: 16px;
      cursor: pointer;
    }
    input[type="submit"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
  <div class="form-container">
    <h2>Student Registration</h2>
    <form action="addstudentcontroller" method="get">
      <label for="fullname">Full Name</label>
      <input type="text" id="fullname" name="name" placeholder="Enter full name" required>

      <label for="email">Email</label>
      <input type="email" id="email" name="email" placeholder="Enter email address" required>

      <label for="mobile">Mobile Number</label>
      <input type="tel" id="mobile" name="mobile" placeholder="Enter mobile number" required>
		<a href="addstudentshow.jsp" >show all student</a>
      <input type="submit" value="Submit">
    </form>
  </div>



</body>
</html>