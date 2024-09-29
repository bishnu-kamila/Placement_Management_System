<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Home Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        header {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
        }

        .container {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
            padding: 20px;
        }
        .logout-btn{
        	
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

        .card:hover {
            transform: scale(1.05);
        }

        .card-header {
            background-color: #333;
            color: #fff;
            padding: 10px;
            text-align: center;
        }

        .card-content {
            padding: 20px;
        }

        .card-content p {
            margin: 0;
        }
    </style>
</head>
<body>

<nav>
    <header>
        <h1>Admin Home Page</h1>
        <button class="logout-btn" onclick="logout()">Logout</button>
    </header>
</nav>
    <div class="container">

        <!-- Fresh Student Application Card -->
        <div class="card" onclick="navigateTo('freshStudentApplication.html')">
            <div class="card-header">Fresh Student Application</div>
            <div class="card-content">
                <p>View and manage fresh student applications.</p>
            </div>
        </div>

        <!-- Fresh Company Application Card -->
        <div class="card" onclick="navigateTo('freshCompanyApplication.html')">
            <div class="card-header">Fresh Company Application</div>
            <div class="card-content">
                <p>View and manage fresh company applications.</p>
            </div>
        </div>

        <!-- Update Notification Card -->
        <div class="card" onclick="navigateTo('AddNotification.jsp')">
            <div class="card-header">Update Notification</div>
            <div class="card-content">
                <p>Check and update notifications.</p>
            </div>
        </div>

        <!-- All Student Card -->
        <div class="card" onclick="navigateTo('showdata')">
            <div class="card-header">All Student</div>
            <div class="card-content">
                <p>View details of all registered students.</p>
            </div>
        </div>

        <!-- All HR Card -->
        <div class="card" onclick="navigateTo('showhr')">
            <div class="card-header">All HR</div>
            <div class="card-content">
                <p>View details of all registered HR.</p>
            </div>
        </div>
        <div class="card" onclick="navigateTo('notification')">
            <div class="card-header">All Notification</div>
            <div class="card-content">
                <p>View details of all registered HR.</p>
            </div>
        </div>

    </div>

    <script>
        function navigateTo(page) {
            window.location.href = page;
        }
    </script>

</body>
</html>
