package com.HrLogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HrLoginController
 */
@WebServlet("/hrlogin")
public class HrLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HrLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String hr_Id = request.getParameter("username");
		String password = request.getParameter("password");
		
		HrLoginDao dao = new HrLoginDao();
		HrLoginModel hr = dao.checkLogin(hr_Id, password);
		
		RequestDispatcher rd = null;
		
		if(hr!=null) {
			rd = request.getRequestDispatcher("HrMenu.jsp");
			request.setAttribute("hrData", hr);
		}else {
			request.setAttribute("Error", "hr_Id and password is not matching");
			rd = request.getRequestDispatcher("HrLogin.jsp");
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
