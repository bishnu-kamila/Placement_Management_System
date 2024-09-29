package com.Notification;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

public class NotificationDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/upms", "root", "Yahoo@123");
		
	}
	public NotificationModel addNotification(NotificationModel notification) {
		
		Connection con = null;
		
		try {
			con = getConnection();
			con.setAutoCommit(false);
			
			
			PreparedStatement ps = con.prepareStatement("Insert into notification(`id`,`topic`,`notification`,`apply_link`,`exam_link`) values(?,?,?,?,?);");
			ps.setInt(1, notification.getId());
			ps.setString(2, notification.getTopic());
			ps.setString(3, notification.getNotification());
			ps.setString(4, notification.getApply_link());
			ps.setString(5, notification.getExam_link());
			
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
				if(con!=null) {
					con.close();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		return notification;
		
	}
}
