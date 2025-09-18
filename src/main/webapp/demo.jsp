<!DOCTYPE html>
<html lang="en">
<head>
  
  
   <style>
    body {
      font-family: 'Segoe UI', sans-serif;
      background: #f9f9f9;
      margin: 0;
      padding: 0;
    }

    .container {
      max-width: 900px;
      margin: 50px auto;
      background: #fff;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
      display: flex;
      border-radius: 10px;
      overflow: hidden;
    }

    .login-section {
      flex: 1;
      padding: 40px;
    }

    h2 {
      margin-bottom: 10px;
      color: #1a2c6b;
      border-bottom: 2px solid #1a2c6b;
      display: inline-block;
      padding-bottom: 5px;
    }

    label {
      display: block;
      margin: 15px 0 5px;
      font-weight: bold;
    }

    input[type="text"],
    input[type="password"] {
      width: 100%;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 5px;
    }

    .required {
      color: red;
      margin-right: 5px;
    }

    .input-group {
      position: relative;
    }

    .input-group svg {
      position: absolute;
      right: 10px;
      top: 35px;
      cursor: pointer;
    }

    .btn {
      margin-top: 20px;
      width: 100%;
      padding: 12px;
      background: #15317e;
      color: white;
      font-size: 16px;
      border: none;
      border-radius: 8px;
      cursor: pointer;
    }

    .btn:hover {
      background: #0d255c;
    }

    .forgot {
      display: block;
      margin-top: 10px;
      text-align: right;
      font-size: 0.9em;
      color: #555;
      text-decoration: none;
    }

    .divider {
      width: 1px;
      background: #ccc;
      position: relative;
    }

    .divider span {
      position: absolute;
      top: 50%;
      left: -12px;
      transform: translateY(-50%);
      background: white;
      border: 2px solid #ccc;
      border-radius: 50%;
      padding: 5px 10px;
      font-weight: bold;
    }

    @media screen and (max-width: 768px) {
      .container {
        flex-direction: column;
      }
      .divider {
        display: none;
      }
    }
  </style>
  
  
  
  
  
</head>
<body>
  
  <div class="container">
  
  
  <form action =  method="post">
  <div class="login-section">
   
    <label><span class="required">*</span>OTP in your mobile</label>
    <input type="text" name="verify" placeholder="Enter Email OTP" />

 
    <button class="btn">Login</button>
  </div>
  
  </form>
  
  
  </div>
  
  
  
</body>
</html>
