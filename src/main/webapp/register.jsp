<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        body, html {
            height: 100%;
            background: url('https://www.dnyanshree.edu.in/images/about-diet.png') no-repeat center center fixed;
            background-size: cover;
        }

        .login-box {
            width: 350px;
            padding: 40px;
            background: rgba(255, 255, 255, 0.1);
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.3);
            backdrop-filter: blur(30px);
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            color: #fff;
        }

        .login-box h2 {
            text-align: center;
            margin-bottom: 30px;
            background-color: #1E90FF;
            padding: 10px;
            border-radius: 6px;
        }

        .login-box input[type="text"],
        .login-box input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            background: rgba(255,255,255,0.2);
            border: none;
            border-radius: 6px;
            color: white;
        }

        .login-box input[type="checkbox"] {
            margin-right: 5px;
        }

        .login-box .options {
            display: flex;
            justify-content: space-between;
            font-size: 14px;
        }

        .login-box input[type="submit"] {
            width: 100%;
            padding: 10px;
            background: white;
            border: none;
            border-radius: 25px;
            color: #333;
            font-weight: bold;
            margin-top: 20px;
            cursor: pointer;
        }

        .login-box .register {
            text-align: center;
            margin-top: 10px;
        }

        .login-box .register a {
            color: #1E90FF;
            text-decoration: none;
        }
    </style>
</head>
<body>

<div class="login-box">
    <h2>Register</h2>
    <form action="registercontroller" method="get">
    	<input type="text" name="id" placeholder="ID" required>
    	<input type="text" name="name" placeholder="NAME" required>
        <input type="text" name="email" placeholder="EMAIL" required>
        
        
        <label for="profile-picture">Upload Profile Picture</label>
        <input type="file" id="profile-picture" name="image" accept="image/*">
        
        
        <input type="password" name="password" placeholder="PASSWORD" required>
		<input type="password" name="conformpassword" placeholder="CONFIRM PASSWORD" required>
		
        <div class="options">
            <label><input type="checkbox" name="remember"> Remember me</label>
            <a href="#">Forgot Password?</a>
        </div>

        <input type="submit" value="Regiter">

        <div class="register">
            login here <a href="login.jsp">Login</a>
        </div>
    </form>
</div>


 <script>
        function validateForm() {
            var password = document.getElementById("password").value;
            var confirmPassword = document.getElementById("confirm-password").value;
            var errorMessage = document.getElementById("error-message");

            if (password !== confirmPassword) {
                errorMessage.textContent = "Passwords do not match.";
                return false;
            }

            errorMessage.textContent = "";
            return true;
        }
    </script>

</body>
</html>
