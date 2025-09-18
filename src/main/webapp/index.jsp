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
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Student Attendance Management System</title>
  <style>
    /* Reset some default styles */
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
    
    .hero {
  background: url('https://img.pikbest.com/backgrounds/20200528/white-abstract-background--backdrop-for-presentation-design-for-website-v_1772529jpg!sw800') no-repeat center center/cover;
  height: 100vh;
  position: relative;
}

    @media (max-width: 768px) {
      .action-button {
        width: 100%;
        max-width: 300px;
      }
    }
  </style>
</head>
<body>





<jsp:include page="header.jsp"></jsp:include>
  
  
  
  <main class="hero">
    <h1>Welcome to the Student Attendance Management System</h1>
   
        <div class="button-container">
     <a href="addstudent.jsp"> <button class="action-button">Add Student</button></a>
     <a href="addshowcontroller"> <button class="action-button">Attendance</button></a>
      <a href="presentshowcontroller"><button class="action-button">Present student</button></a>
      <a href="absentshowcontroller"><button class="action-button">Absent student</button></a>
    </div>
 
    
  </main>


</body>
</html>