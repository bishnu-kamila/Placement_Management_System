package com.Student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationContrroller
 */
@WebServlet("/registration")
public class RegistrationContrroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationContrroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String userName = request.getParameter("userName");
		String regd_No = request.getParameter("regd_No");
		String password = request.getParameter("password");
		String university_Email = request.getParameter("university_email");
		String contact_No = request.getParameter("contact_No");
		String e_Mail = request.getParameter("e_mail");
		String department = request.getParameter("department");
		String gender = request.getParameter("gender");
		double cgpa = Double.parseDouble(request.getParameter("cgpa"));
		
		Student student = new Student();
		student.setId(id);
		student.setUserName(userName);
		student.setRegd_No(regd_No);
		student.setPassword(password);
		student.setUniversity_email(university_Email);
		student.setContact_No(contact_No);
		student.setE_Mail(e_Mail);
		student.setDepartment(department);
		student.setGender(gender);
		student.setCgpa(cgpa);
		
		StudentRegistrationDao dao = new StudentRegistrationDao();
		dao.addStudent(student);
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		
	}

}
