package com.StudentLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentLoginDao {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/upms", "root", "Yahoo@123");
		
		
	}
	
	public StudentLogin checkLogin(String regd_No , String password) {
		Connection conn = null;
		StudentLogin student = null;
		
		try {
			conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("select u.id , u.`userName`,u.`university_email`,u.`contact_No`,u.`e_Mail`,u.`department`,u.gender,u.cgpa from student as u where u.`regd_No`=? and u.password=?;");
			ps.setString(1, regd_No);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				student = new StudentLogin();
				student.setId(rs.getInt("id"));
				student.setUserName(rs.getString("userName"));
				student.setUniversity_email(rs.getString("university_email"));
				student.setContact_No(rs.getString("contact_No"));
				student.setE_Mail(rs.getString("e_Mail"));
				student.setDepartment(rs.getString("department"));
				student.setGender(rs.getString("gender"));
				student.setCgpa(rs.getString("cgpa"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
		
		
		return student;
	}

}
