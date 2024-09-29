package com.HrLogin;

public class HrLoginModel {
	private String userName;
	private String e_Mail;
	private String companyName;
	private String jobPost;
	private String vacancy;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getE_Mail() {
		return e_Mail;
	}
	public void setE_Mail(String e_Mail) {
		this.e_Mail = e_Mail;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobPost() {
		return jobPost;
	}
	public void setJobPost(String jobPost) {
		this.jobPost = jobPost;
	}
	public String getVacancy() {
		return vacancy;
	}
	public void setVacancy(String vacancy) {
		this.vacancy = vacancy;
	}
	@Override
	public String toString() {
		return "HrLoginModel [userName=" + userName + ", e_Mail=" + e_Mail + ", companyName=" + companyName
				+ ", jobPost=" + jobPost + ", vacancy=" + vacancy + "]";
	}
	
	
	
}
