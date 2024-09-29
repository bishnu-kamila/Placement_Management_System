package com.ShowNotification;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditNotificationServlet
 */
@WebServlet("/editnotification")
public class EditNotificationServlet extends HttpServlet {
	private final static String query = "Update notification set topic=?,notification=?,apply_link=?,exam_link=? where id=?";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("id"));
		String topic = request.getParameter("topic");
		String notification = request.getParameter("notification");
		String apply_link = request.getParameter("apply_link");
		String exam_link = request.getParameter("exam_link");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/upms", "root", "Yahoo@123") ;
			PreparedStatement ps = con.prepareStatement(query);){
			ps.setString(1, topic);
			ps.setString(2, notification);
			ps.setString(3, apply_link);
			ps.setString(4, exam_link);
			ps.setInt(5, id);
			int count = ps.executeUpdate();
			if(count==1) {
				pw.println("<h2> Record Edited Successfully</h2>");
			}else {
				pw.println("<h2>Record Not Edited</h2>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
