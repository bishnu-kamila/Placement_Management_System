<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
        }

        .login-container {
            margin: 0 auto;
            width: 300px;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        #error-message {
            color: red;
            margin-top: 10px;
        }
    </style>
</head>
<body>



    <div class="login-container">
        <h2>Login</h2>
        <form action="hrlogin" id="login-form" method="post">
            <label for="username">UserName:</label>
            <input type="text" id="username" name="username" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
			<button type="submit" >Login</button>
            
        </form>
        <%
	String error=(String)request.getAttribute("Error");
	if(error!=null)
	{
	%>
	<p style="color: red;"><%= error %></p>
	<% }
	%>
	
    </div>

    
    
</body>
</html>