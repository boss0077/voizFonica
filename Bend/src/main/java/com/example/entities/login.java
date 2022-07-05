package com.example.entities;

public class login {
	private String uname;	//user name
	private String pwd;		//password [Login Credentials]
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
	@Override
	public String toString() {
		return "login [uname=" + uname + ", pwd=" + pwd + "]";
	}
	public login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public login(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
	

}
