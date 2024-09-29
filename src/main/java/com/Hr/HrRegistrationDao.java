package com.Hr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HrRegistrationDao {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/upms", "root", "Yahoo@123");
		
	}
	
	public Hr addHr(Hr hr) {
		Connection con = null;
		
		try {
			con = getConnection();
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement("Insert into Hr(`id`,`userName`,`hr_Id`,`password`,`e_Mail`,`companyName`,`jobPost`,`vacancy`) values(?,?,?,?,?,?,?,?);");
			ps.setInt(1, hr.getId());
			ps.setString(2, hr.getUserName());
			ps.setString(3, hr.getHr_Id());
			ps.setString(4, hr.getPassword());
			ps.setString(5, hr.getE_Mail());
			ps.setString(6, hr.getCompanyName());
			ps.setString(7, hr.getJobPost());
			ps.setString(8, hr.getVacancy());
			
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
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		}
		
		
		return hr;
		
	}
}
