<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Page</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
        }

        header {
            background-color: #333;
            padding: 10px;
            text-align: center;
        }

        header img {
            width: 50px;
            height: 50px;
            vertical-align: middle;
        }

        header h1 {
            display: inline-block;
            margin: 0;
            color: white;
        }

        nav {
            background-color: #555;
            overflow: hidden;
        }

        nav a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        nav a:hover {
            background-color: #ddd;
            color: black;
        }

        .content {
            padding: 20px;
        }
        .card {
            width: 300px;
            margin: 20px;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            overflow: hidden;
            transition: transform 0.3s;
            cursor: pointer;
        }

        .home-page {
            background-image: url('https://static.vecteezy.com/system/resources/thumbnails/008/311/935/small/the-illustration-graphic-consists-of-abstract-background-with-a-blue-gradient-dynamic-shapes-composition-eps10-perfect-for-presentation-background-website-landing-page-wallpaper-vector.jpg'); /* Add the path to your background image */
            background-size: cover;
            color: white;
            text-align: center;
            padding: 100px;
        }

        .logout-btn {
            background-color: #f44336;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin-top: 20px;
        }

        .logout-btn:hover {
            background-color: #d32f2f;
        }
    </style>
</head>
<body>

    <header>
        <img src="https://thegttech.com/img/icon/cutm_logo.png" alt="Logo">
        <h1>Welcome to Our University Placement Management System</h1>
    </header>

    <nav>
        <a href="#">Home</a>
        <a href="#">About</a>
        <a href="#">Address</a>
        <a href="notification">Notification</a>
        <a href="HrLogin.jsp" style="float: right;">Logout</a>
    </nav>

    <div class="content">
        <div class="home-page">
            <h2>Thank You For Hiring Our Students</h2>
            
            <h2>You can Add Notification  </h2>
            <a href="AddNotification.jsp"> <input type="button" class="logout-btn" value="Add Notification"></a>
            <h2>You can Update the Notification  </h2>
            <a href='notification'> <input type="button" class="logout-btn" value="Update Notification"></a>
            
            
            
        </div>
        
    </div>

</body>
</html>
