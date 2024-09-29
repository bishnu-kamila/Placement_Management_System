package com.StudentLogin;

public class StudentLogin {
	private int id;
	private String userName;
	private String university_email;
	private String contact_No;
	private String e_Mail;
	private String department;
	private String gender;
	private String cgpa;
	
	
	
	
	
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
	public String getUniversity_email() {
		return university_email;
	}
	public void setUniversity_email(String university_email) {
		this.university_email = university_email;
	}
	public String getContact_No() {
		return contact_No;
	}
	public void setContact_No(String contact_No) {
		this.contact_No = contact_No;
	}
	public String getE_Mail() {
		return e_Mail;
	}
	public void setE_Mail(String e_Mail) {
		this.e_Mail = e_Mail;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "StudentLogin [id=" + id + ", userName=" + userName + ", university_email=" + university_email
				+ ", contact_No=" + contact_No + ", e_Mail=" + e_Mail + ", department=" + department + ", gender="
				+ gender + ", cgpa=" + cgpa + "]";
	}
	
	
	
	
	

}
