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


@WebServlet("/edit")
public class EditRecordServletView extends HttpServlet {
	private final static String query = "Update student set userName=?,university_email=?,contact_No=?,e_Mail=?,department=?,gender=?,cgpa=? where id=?";
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("id"));
		String userName = request.getParameter("userName");
		String university_email = request.getParameter("university_email");
		String contact_No = request.getParameter("contact_No");
		String e_Mail = request.getParameter("e_Mail");
		String department = request.getParameter("department");
		String gender = request.getParameter("gender");
		double cgpa = Double.parseDouble(request.getParameter("cgpa"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/upms", "root", "Yahoo@123") ;
			PreparedStatement ps = con.prepareStatement(query);){
			ps.setString(1, userName);
			ps.setString(2, university_email);
			ps.setString(3, contact_No);
			ps.setString(4, e_Mail);
			ps.setString(5, department);
			ps.setString(6, gender);
			ps.setDouble(7, cgpa);
			ps.setInt(8, id);
			int count = ps.executeUpdate();
			if(count==1) {
				pw.println("<h2> Record Edited Successfully</h2>");
			}else {
				pw.println("<h2>Record Not Edited</h2>");
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
