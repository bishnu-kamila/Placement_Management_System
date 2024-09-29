package com.ShowNotification;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditNotificationServlet
 */
@WebServlet("/editnot")
public class EditNotificationServletView extends HttpServlet {
	private final static String query = "Select topic , notification , apply_link , exam_link from notification where id=?";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("id"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/upms", "root", "Yahoo@123") ;
			PreparedStatement ps = con.prepareStatement(query);){
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();
			pw.println("<div style='margin:auto;width:500px;margin-top:100px;'>");
			pw.println("<form action = 'editnotification?id="+id+"' method='post'>");
			pw.println("<h1>Update Notification</h1>");
			pw.println("<table>");
			pw.println("<tr>");
			pw.println("<td>TOPIC</td>");
			pw.println("<td><input type = 'text' name='topic' value = '"+rs.getString(1)+"'</td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>NOTIFICATION</td>");
			pw.println("<td><input type = 'text' name='notification' value = '"+rs.getString(2)+"'</td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>APPLY_LINK</td>");
			pw.println("<td><input type = 'text' name='apply_link' value = '"+rs.getString(3)+"'></td>");
			pw.println("</tr>");
			
			pw.println("<tr>");
			pw.println("<td>EXAM_LINK</td>");
			pw.println("<td><input type = 'text' name='exam_link' value = '"+rs.getString(4)+"'</td>");
			pw.println("</tr>");
			
			pw.println("<tr>");
			pw.println("<td><button type = 'submit'>Edit</button></td>");
			pw.println("<td><button type = 'reset'>Cancel</button></td>");
			pw.println("</tr>");
			
			pw.println("</table>");
			
			pw.println("</form>");
			
			
		}catch (Exception e) {
			// TODO: handle exception
			pw.println("<h2>"+e.getMessage()+"</h2>");
			e.printStackTrace();
		}
		pw.println("<a href = 'notification'><button>Show All Notification</button></a>");		
		pw.close();	
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
