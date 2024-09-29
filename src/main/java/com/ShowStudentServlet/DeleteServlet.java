package com.ShowStudentServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/deleteurl")
public class DeleteServlet extends HttpServlet {
	private final static String query = "delete from student where id = ?";
    
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
			int count = ps.executeUpdate();
			if(count==1) {
				pw.println("<h2> Record Deleted Successfully</h2>");
			}else {
				pw.println("<h2>Record Not Deleted</h2>");
			}
			
			
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
