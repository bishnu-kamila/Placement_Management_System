package com.AdminLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminLoginDao {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/upms", "root", "Yahoo@123");		
	}
	
	public AdminLoginModel checkLogin(String admin_Id , String password)  {
		
		Connection con = null;
		AdminLoginModel admin = null;
		
		
		try {
			con = getConnection();
			PreparedStatement ps = con.prepareStatement("Select * from admin where admin_Id = ? and password = ?");
			ps.setString(1, admin_Id);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				admin = new AdminLoginModel();
				admin.setAdminName(rs.getString("adminName"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
		
		
		return admin;
		
	}

}
