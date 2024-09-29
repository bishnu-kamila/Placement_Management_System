package com.StudentLogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentLoginController
 */
@WebServlet("/login")
public class StudentLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String regd_No = request.getParameter("username");
		String password = request.getParameter("password");
		
		StudentLoginDao dao = new StudentLoginDao();
		StudentLogin student = dao.checkLogin(regd_No , password);
		
		RequestDispatcher rd = null;
		
		if(student!=null) {
			rd = request.getRequestDispatcher("StudentMenu.jsp");
			request.setAttribute("studentData", student);
		}else {
			request.setAttribute("Error","regd_No and password is incorect");
			rd = request.getRequestDispatcher("Login.jsp");
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
