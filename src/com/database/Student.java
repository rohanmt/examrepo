package com.database;

public class Student 
{
	
	private String name;
	private String uname;
	private String pwd;
	private String dob;
	private String gender;
	private String email;
	private String comments;
	public Student(String name, String uname, String pwd, String dob, String gender, String email, String comments) {
		super();
		this.name = name;
		this.uname = uname;
		this.pwd = pwd;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.comments = comments;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", uname=" + uname + ", pwd=" + pwd + ", dob=" + dob + ", gender=" + gender
				+ ", email=" + email + ", comments=" + comments + "]";
	}
	
	

}
