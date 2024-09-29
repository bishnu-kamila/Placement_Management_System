package com.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRegistrationDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
	    
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        return DriverManager.getConnection("jdbc:mysql://localhost:3306/upms", "root", "Yahoo@123");
	  
	       
	}
	public Student addStudent(Student student) {
	    Connection conn = null;

	    try {
	        conn = getConnection();
	        conn.setAutoCommit(false);
	        
	        
	        
	        
	        	PreparedStatement ps = conn.prepareStatement("Insert into Student(`id`,`userName`,`regd_No`,`password`,`university_email`,`contact_No`,`e_Mail`,`department`,`gender`,`cgpa`) values(?,?,?,?,?,?,?,?,?,?);");

	    	    ps.setInt(1, student.getId());
		        ps.setString(2, student.getUserName());
		        ps.setString(3, student.getRegd_No());
		        ps.setString(4, student.getPassword());
		        ps.setString(5, student.getUniversity_email());
		        ps.setString(6, student.getContact_No());
		        ps.setString(7, student.getE_Mail());
		        ps.setString(8, student.getDepartment());
		        ps.setString(9, student.getGender());
		        ps.setDouble(10, student.getCgpa());

		        int rs = ps.executeUpdate();
		        

		        if (rs == 1) {
		            conn.commit();
		        } else {
		            conn.rollback();
		        }
	        
	        
	        
	        

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (conn != null) {
	                conn.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return student;
	}

		
		
		
	}

