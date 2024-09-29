package com.Hr;

public class Hr {
	private int id;
	private String userName;
	private String hr_Id;
	private String password;
	private String e_Mail;
	private String companyName;
	private String jobPost;
	private String vacancy;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getHr_Id() {
		return hr_Id;
	}
	public void setHr_Id(String hr_Id) {
		this.hr_Id = hr_Id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
		return "Hr [id=" + id + ", userName=" + userName + ", hr_Id=" + hr_Id + ", password=" + password + ", e_Mail="
				+ e_Mail + ", companyName=" + companyName + ", jobPost=" + jobPost + ", vacancy=" + vacancy + "]";
	}
	
	
	
	

}
