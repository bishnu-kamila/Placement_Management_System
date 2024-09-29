<%@page import="com.Notification.NotificationModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Notification Table</title>
    
</head>
<body>


    <h2>Notification Table</h2>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>TOPIC</th>
                <th>NOTIFICATION</th>
            </tr>
        </thead>
        <tbody>
            <!-- Example rows, you can dynamically generate these based on your data -->
            <%NotificationModel notification = (NotificationModel)request.getAttribute("Notification.jsp"); 
            	if(notification!=null){
            		
            	
            %>
            <tr>
	
	 <td><% out.print( notification.getId() );%></td>
	  <td> <% out.print(notification.getTopic());%></td>
	   <td><%out.print(notification.getNotification());%> </td>
	
	</tr>
	<% } %>
        </tbody>
    </table>

</body>
</html>
