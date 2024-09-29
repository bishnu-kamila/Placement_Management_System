package com.HrLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HrLoginDao {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/upms", "root", "Yahoo@123");
		
	}
	
	public HrLoginModel checkLogin(String hr_Id , String password) {
		
		Connection conn = null;
		HrLoginModel hr = null;
		
		try {
			conn = getConnection();
			
			PreparedStatement ps = conn.prepareStatement("Select * from hr where hr_Id = ? and password = ?");
			ps.setString(1, hr_Id);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				hr = new HrLoginModel();
				
				hr.setUserName(rs.getString("userName"));
				hr.setE_Mail(rs.getString("e_Mail"));
				hr.setCompanyName(rs.getString("companyName"));
				hr.setJobPost(rs.getString("jobPost"));
				hr.setVacancy(rs.getString("vacancy"));
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
		
		return hr;
		
	}

}
