package com.ShowStudentServlet;

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
 * Servlet implementation class EditStudentServlet
 */
@WebServlet("/editurl")
public class EditStudentServlet extends HttpServlet {
	private final static String query = "Select userName,university_email,contact_No,e_Mail,department,gender,cgpa from student where id=?";
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
//			pw.println("<div style='margin:auto;width:500px;margin-top:100px;'>");
			pw.println("<form action = 'edit?id="+id+"' method='post'>");
			pw.println("<table>");
			pw.println("<tr>");
			pw.println("<td>Name</td>");
			pw.println("<td><input type = 'text' name='userName' value = '"+rs.getString(1)+"'</td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>University Email</td>");
			pw.println("<td><input type = 'email' name='university_email' value = '"+rs.getString(2)+"'</td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>Contact_No</td>");
			pw.println("<td><input type = 'text' name='contact_No' value = '"+rs.getString(3)+"'</td>");
			pw.println("</tr>");
			
			pw.println("<tr>");
			pw.println("<td>E_Mail</td>");
			pw.println("<td><input type = 'email' name='e_Mail' value = '"+rs.getString(4)+"'</td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>Department</td>");
			pw.println("<td><input type = 'text' name='department' value = '"+rs.getString(5)+"'</td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>Gender</td>");
			pw.println("<td><input type = 'text' name = 'gender' value = '"+rs.getString(6)+"'</td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>CGPA</td>");
			pw.println("<td><input type = 'text' name = 'cgpa' value = '"+rs.getString(7)+"'</td>");
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
		pw.println("<a href = 'showdata'><button>Show All Students</button></a>");		
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
