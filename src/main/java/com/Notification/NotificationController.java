package com.Notification;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NotificationController
 */
@WebServlet("/addnotification")
public class NotificationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String topic = request.getParameter("topic");
		String notification = request.getParameter("notification");
		String apply_link = request.getParameter("apply_link");
		String exam_link = request.getParameter("exam_link");
		
		NotificationModel notificationModel = new NotificationModel();
		
		notificationModel.setId(id);
		notificationModel.setTopic(topic);
		notificationModel.setNotification(notification);
		notificationModel.setApply_link(apply_link);
		notificationModel.setExam_link(exam_link);
		
		NotificationDao dao = new NotificationDao();
		dao.addNotification(notificationModel);
		
		RequestDispatcher rd = request.getRequestDispatcher("AddNotification.jsp");
		
		
	}

}
