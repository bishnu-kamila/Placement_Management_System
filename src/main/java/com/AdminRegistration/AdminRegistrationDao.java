package com.AdminRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminRegistrationDao {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/upms", "root", "Yahoo@123");
		
	}
	public Admin addAdmin(Admin admin) {
		
		Connection con = null;
		try {
			con = getConnection();
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement("Insert into Admin(`adminName`,`admin_Id`,`password`) values(?,?,?);");
			ps.setString(1, admin.getAdminName());
			ps.setString(2, admin.getAdmin_Id());
			ps.setString(3, admin.getPassword());
			
			int rs = ps.executeUpdate();
			if(rs==1) {
				con.commit();
			}else {
				con.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (con != null) {
	                con.close();
	            }
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
		return admin;
		
	}

}
