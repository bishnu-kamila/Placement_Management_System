<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            
        }

        .registration-container {
            margin: 0 auto;
            width: 400px;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        input[type="text"],
        input[type="email"],
        input[type="tel"],
        input[type="number"],
        select,
        input[type="date"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="radio"] {
            margin: 5px 10px;
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
    </style>
</head>
<body>

<%-- <input type="hidden" id="status" value="<%= request.getAttribute("status") %>"> --%>
    <div class="registration-container">
        <h2 align="Center">Registration Form</h2>
        <form action="registration" method="post">
        
        	<label for="name">id:</label>
            <input type="text" id="userName" name="id" required>
        	
            <label for="name">Name:</label>
            <input type="text" id="userName" name="userName" required>

            <label for="Regd_no">Registration Number:</label>
            <input type="text" id="regd_No" name="regd_No" required>
            <label for="password">Password:</label>
        	<input type="password" id="password" name="password" required><br><br>

            <label for="university_email">University Email:</label>
            <input type="email" id="university_email" name="university_email" required>

            <label for="contact_no">Contact Number:</label>
            <input type="tel" id="contact_No" name="contact_No" required>

            <label for="email">Email:</label>
            <input type="email" id="e_mail" name="e_mail" required>

            <label for="department">Department:</label>
            <select id="department" name="department" required>
				<option value="Select">Select</option>
                <option value="MCA">MCA</option>
                <option value="BCA">BCA</option>
                <option value="B-tech">B-tech</option>
                <option value="MBA">MBA</option>
                <option value="M-tech">M-tech</option>
            </select>


            <label>Gender:</label>
            <input type="radio" id="male" name="gender" value="Male" required>
            <label for="male">Male</label>
            <input type="radio" id="female" name="gender" value="Female" required>
            <label for="female">Female</label><br>

            <label for="cgpa">Last Semester CGPA:</label>
            <input type="number" step="0.01" id="cgpa" name="cgpa" required>
            

            
            <button type="submit">Register</button>
        </form>
    </div>
    <!-- <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	
	<script type="text/javascript">
		var status = document.getElementById("status").value;
		if(status == "Success"){
			swal("Account Created Successfully","Success");
		} -->
	<!-- </script> -->
</body>
</html>