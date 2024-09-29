package com.AdminLogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminLoginController
 */
@WebServlet("/adminlogin")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String admin_Id = request.getParameter("username");
		String password = request.getParameter("password");
		
		AdminLoginDao dao = new AdminLoginDao();
		AdminLoginModel admin = dao.checkLogin(admin_Id, password);

		
		RequestDispatcher rd = null;
		
		if(admin!=null) {
			rd = request.getRequestDispatcher("AdminMenu.jsp");
			request.setAttribute("adminData", admin);
		}else {
			request.setAttribute("Error", "admin_Id and password is incorrect");
			rd = request.getRequestDispatcher("AdminLogin.jsp");
		}
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
