<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>About - Attendance Management System</title>
  <style>
    /* Reset and base styles */
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
    }

    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background-color: #f4f4f4;
      color: #333;
      line-height: 1.6;
    }

    header {
      background-color: #2c3e50;
      color: #ecf0f1;
      padding: 20px 0;
      text-align: center;
      animation: slideDown 0.5s ease-out;
    }

    @keyframes slideDown {
      from { transform: translateY(-100%); opacity: 0; }
      to { transform: translateY(0); opacity: 1; }
    }

    .container {
      max-width: 1000px;
      margin: 30px auto;
      padding: 20px;
      background-color: #fff;
      border-radius: 8px;
      box-shadow: 0 2px 8px rgba(0,0,0,0.1);
      animation: fadeIn 1s ease-in;
    }

    @keyframes fadeIn {
      from { opacity: 0; }
      to { opacity: 1; }
    }

    h1, h2 {
      color: #2c3e50;
      margin-bottom: 10px;
    }

    p {
      margin-bottom: 15px;
    }

    ul {
      list-style-type: disc;
      margin-left: 20px;
      margin-bottom: 15px;
    }

    footer {
      text-align: center;
      padding: 15px 0;
      background-color: #ecf0f1;
      color: #7f8c8d;
      margin-top: 30px;
    }

    /* Responsive Design */
    @media (max-width: 600px) {
      .container {
        margin: 15px;
        padding: 15px;
      }

      h1 {
        font-size: 24px;
      }

      h2 {
        font-size: 20px;
      }
    }
  </style>
</head>
<body>

  <header>
    <h1>About Our Attendance Management System</h1>
  </header>

  <div class="container">
    <section>
      <h2> Overview</h2>
      <p>Our Attendance Management System (AMS) is a modern, cloud-based solution designed to streamline and automate the tracking of employee attendance. By leveraging advanced technologies such as biometric authentication, facial recognition, and geolocation, the AMS ensures accurate and efficient attendance recording.</p>
    </section>

    <section>
      <h2> Our Mission</h2>
      <p>To empower organizations with a reliable and efficient tool that simplifies attendance tracking, enhances workforce accountability, and supports data-driven decision-making.</p>
    </section>

    <section>
      <h2> Key Features</h2>
      <ul>
        <li><strong>Real-Time Attendance Tracking:</strong> Monitor employee check-ins and check-outs in real-time, ensuring up-to-date records.</li>
        <li><strong>Biometric Integration:</strong> Utilize fingerprint or facial recognition to prevent proxy attendance and enhance security.</li>
        <li><strong>Mobile Accessibility:</strong> Allow employees to mark attendance via mobile devices, accommodating remote and field workers.</li>
        <li><strong>Geofencing Capabilities:</strong> Restrict attendance marking to specific locations, ensuring authenticity.</li>
        <li><strong>Comprehensive Reporting:</strong> Generate detailed reports on attendance patterns, absenteeism, and overtime for informed HR decisions.</li>
        <li><strong>Seamless Integration:</strong> Integrate with existing HR and payroll systems for streamlined operations.</li>
      </ul>
    </section>

    <section>
      <h2> Benefits</h2>
      <ul>
        <li><strong>Enhanced Accuracy:</strong> Eliminates manual errors associated with traditional attendance tracking methods.</li>
        <li><strong>Improved Compliance:</strong> Ensures adherence to labor laws and organizational policies.</li>
        <li><strong>Increased Productivity:</strong> Reduces administrative workload, allowing HR teams to focus on strategic tasks.</li>
        <li><strong>Data-Driven Insights:</strong> Provides actionable insights into workforce attendance trends and behaviors.</li>
      </ul>
    </section>

    <section>
      <h2>Who Can Benefit?</h2>
      <ul>
        <li><strong>Corporations:</strong> Manage large workforces with varying schedules.</li>
        <li><strong>Educational Institutions:</strong> Track student and staff attendance efficiently.</li>
        <li><strong>Healthcare Facilities:</strong> Ensure timely attendance of medical professionals.</li>
        <li><strong>Government Agencies:</strong> Maintain accurate records for public sector employees.</li>
      </ul>
    </section>

    <section>
      <h2> Get Started</h2>
      <p>Experience the transformation in attendance management. Contact us today to learn more about implementing our AMS in your organization.</p>
    </section>
  </div>

  <footer>
    &copy; 2025 Attendance Management System. All rights reserved.
  </footer>

</body>
</html>
s