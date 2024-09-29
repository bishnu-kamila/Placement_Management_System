<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .registration-container {
            background-color: #fff;
            border-radius: 8px;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }

        .registration-container h2 {
            color: #333;
        }

        .registration-form {
            display: flex;
            flex-direction: column;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group label {
            display: block;
            margin-bottom: 5px;
            color: #555;
        }

        .form-group input {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .submit-btn {
            background-color: #4caf50;
            color: #fff;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        .submit-btn:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="registration-container">
        <h2> Add Notification</h2>
        <form class="registration-form" action="addnotification" method="post">
            <div class="form-group">
                <label for="id">ID:</label>
                <input type="text" id="id" name="id" required>
            </div>

            <div class="form-group">
                <label for="topic">TOPIC:</label>
                <input type="text" id="topic" name="topic" required>
            </div>

            <div class="form-group">
                <label for="notification">NOTIFICATION:</label>
                <input type="text" id="notification" name="notification" required>
            </div>
            <div class="form-group">
                <label for="apply_link">NOTIFICATION:</label>
                <input type="text" id="apply_link" name="apply_link" required>
            </div>
            <div class="form-group">
                <label for="exam_link">NOTIFICATION:</label>
                <input type="text" id="exam_link" name="exam_link" required>
            </div>

            <input type="submit" value="Register"></a>
        </form>
    </div>
</body>
</html>
    