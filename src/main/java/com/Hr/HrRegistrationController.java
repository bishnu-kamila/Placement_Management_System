package com.Hr;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HrRegistrationController
 */
@WebServlet("/hrregistration")
public class HrRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String userName = request.getParameter("userName");
		String hr_Id = request.getParameter("hr_Id");
		String password = request.getParameter("password");
		String e_Mail = request.getParameter("e_Mail");
		String companyName = request.getParameter("companyName");
		String jobPost = request.getParameter("jobPost");
		String vacancy = request.getParameter("vacancy");
		
		Hr hr = new Hr();
		
		hr.setId(id);
		hr.setUserName(userName);
		hr.setHr_Id(hr_Id);
		hr.setPassword(password);
		hr.setE_Mail(e_Mail);
		hr.setCompanyName(companyName);
		hr.setJobPost(jobPost);
		hr.setVacancy(vacancy);
		
		
		HrRegistrationDao dao = new HrRegistrationDao();
		dao.addHr(hr);
	}

}
