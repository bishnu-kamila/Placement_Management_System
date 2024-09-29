<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
  <title>HR Registration</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      margin: 0;
      padding: 0;
      display: flex;
      align-items: center;
      justify-content: center;
      height: 100vh;
    }

    #registration-form {
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    label {
      display: block;
      margin-bottom: 8px;
    }

    input {
      width: 100%;
      padding: 8px;
      margin-bottom: 15px;
      box-sizing: border-box;
    }

    button {
      background-color: #4caf50;
      color: white;
      border: none;
      padding: 10px;
      border-radius: 3px;
      cursor: pointer;
    }

    button:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>

<input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
    <div class="registration-container">


  <div id="registration-form">
    <h2>HR Registration</h2>
    <form action="hrregistration" method="post">
    
    <label for="id">ID:</label>
            <input type="text" id="userName" name="id" required>
      <label for="userName">Username:</label>
      <input type="text" id="userName" name="userName" required>

      <label for="hrId">HR ID:</label>
      <input type="text" id="hrId" name="hr_Id" required>

      <label for="password">Password:</label>
      <input type="password" id="password" name="password" required>

      <label for="email">Email:</label>
      <input type="email" id="email" name="e_Mail" required>

      <label for="companyName">Company Name:</label>
      <input type="text" id="companyName" name="companyName" required>

      <label for="jobPost">Job Post:</label>
      <input type="text" id="jobPost" name="jobPost" required>

      <label for="vacancy">Vacancy:</label>
      <input type="number" id="vacancy" name="vacancy" required>

      
      <a href="Login.jsp"><input type="submit" value="Register"></a>
    </form>
  </div>


<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	
	<script type="text/javascript">
		var status = document.getElementById("status").value;
		if(status == "Success"){
			swal("Account Created Successfully","Success");
		}
  

</body>
</html>
