<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Mountain Navigation</title>
 
</head>
<body>

<style>

body, html {
  margin: 0;
  padding: 0;
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
  height: 100%;
}

.hero {
  background: url('https://www.dnyanshree.edu.in/images/about-diet.png') no-repeat center center/cover;
  height: 100vh;
  position: relative;
}

.navbar {
  position: absolute;
  top: 30px;
  left: 50%;
  transform: translateX(-50%);
  background: rgba(50, 50, 50, 0.4);
  border-radius: 50px;
  padding: 15px 40px;
  backdrop-filter: blur(10px);
  box-shadow: 0 8px 24px rgba(0, 0, 0, 0.2);
}

.nav-links {
  list-style: none;
  display: flex;
  gap: 40px;
  margin: 0;
  padding: 0;
}

.nav-links li a {
  color: #ffd700;
  text-decoration: none;
  font-weight: bold;
  font-size: 18px;
  transition: color 0.3s ease;
  margin-left:60px;
}

.nav-links li a:hover {
  color: #ffffff;
}



    /* Reset and base styles */
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
    }

    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background-color: #f4f4f4;
    }

    /* Sidebar styles */
    .sidebar {
      position: fixed;
      top: 0;
      left: 0;
      width: 250px;
      height: 100%;
      background-color: #2c3e50;
      padding-top: 60px;
      transform: translateX(-100%);
      transition: transform 0.3s ease;
    }

    .sidebar a {
      display: block;
      padding: 15px 25px;
      color: #ecf0f1;
      text-decoration: none;
      transition: background 0.3s;
    }

    .sidebar a:hover {
      background-color: #34495e;
    }

    /* Toggle button styles */
    #sidebarToggle {
      display: none;
    }

    .toggle-label {
      position: fixed;
      top: 15px;
      left: 15px;
      font-size: 30px;
      color: #2c3e50;
      cursor: pointer;
      z-index: 1001;
    }

    /* Show sidebar when checkbox is checked */
    #sidebarToggle:checked ~ .sidebar {
      transform: translateX(0);
    }

    /* Content area */
    .content {
      margin-left: 0;
      padding: 20px;
      transition: margin-left 0.3s ease;
    }

    #sidebarToggle:checked ~ .content {
      margin-left: 250px;
    }

    /* Responsive adjustments */
    @media (max-width: 768px) {
      .sidebar {
        width: 200px;
      }

      #sidebarToggle:checked ~ .content {
        margin-left: 200px;
      }
    }

    @media (max-width: 480px) {
      .toggle-label {
        font-size: 24px;
      }
    }
  </style>


  

 




  <div class="hero">
  
  
  <!-- Sidebar toggle checkbox -->
  <input type="checkbox" id="sidebarToggle" />

  <!-- Label for the toggle checkbox -->
  <label for="sidebarToggle" class="toggle-label">&#9776;</label>

  <!-- Sidebar navigation -->
  <nav class="sidebar">
    <a href="#home">Home</a>
    <a href="about.jsp">About</a>
    <a href="register.jsp">Registration</a>
    <a href="login.jsp">Login</a>
  </nav>





    <nav class="navbar">
      <ul class="nav-links">
        <li><a href="about.jsp">About</a></li>
        
        <li><a href="register.jsp">Registration</a></li>
        <li><a href="login.jsp">Login</a></li>
       
      </ul>
    </nav>
  </div>
</body>
</html>
