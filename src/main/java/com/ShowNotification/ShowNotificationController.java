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
 * Servlet implementation class ShowNotificationController
 */
@WebServlet("/notification")
public class ShowNotificationController extends HttpServlet {
	private final static String query = "Select id,topic,notification,apply_link,exam_link from notification";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/upms", "root", "Yahoo@123") ;
			PreparedStatement ps = con.prepareStatement(query);){
			ResultSet rs = ps.executeQuery();
//			pw.println("<div >");
			pw.println("<table border='3' align='center'>");
			pw.println("<tr>");
			pw.println("<th>ID</th>");
			pw.println("<th>TOPIC</th>");
			
			pw.println("<th>NOTIFICATION</th>");
			pw.println("<th>APPLY_LINK</th>");
			pw.println("<th>EXAM_LINK</th>");
			pw.println("<th>Edit</th>");
			pw.println("<th>Delete</th>");
			
			pw.println("</tr>");
			while(rs.next()) {
				pw.println("<tr>");
				pw.println("<td>"+rs.getInt(1)+"</td>");
				pw.println("<td>"+rs.getString(2)+"</td>");
				pw.println("<td>"+rs.getString(3)+"</td>");
				pw.println("<td>"+rs.getString(4)+"</td>");
				pw.println("<td>"+rs.getString(5)+"</td>");
				pw.println("<td><a href='editnot?id="+rs.getInt(1)+"'>Edit</a></td>");
				pw.println("<td><a href='deletenot?id="+rs.getInt(1)+"'>Delete</a></td>");
				pw.println("</tr>");
			}
			pw.println("</table>");
			
		}catch (Exception e) {
			// TODO: handle exception
			pw.println("<h2>"+e.getMessage()+"</h2>");
			e.printStackTrace();
		}
				
			
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
