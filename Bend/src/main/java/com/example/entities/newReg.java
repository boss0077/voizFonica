package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class newReg {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Rid;		//registration ID
	private String name;	//Name of the User
	private String pnum;	//Phone number of user
	private String email;	//email of user
	private int age;		//age of the user 
	private String pwd;		//new password
	private String cpwd;	//confirmation password 
	

	@Override
	public String toString() {
		return "newReg [Rid=" + Rid + ", name=" + name + ", pnum=" + pnum + ", email=" + email + ", age=" + age
				+ ", pwd=" + pwd + ", cpwd=" + cpwd + "]";
	}
	public newReg(String name, String pnum, String email, int age, String pwd, String cpwd) {
		super();
		this.name = name;
		this.pnum = pnum;
		this.email = email;
		this.age = age;
		this.pwd = pwd;
		this.cpwd = cpwd;
	}
	public int getRid() {
		return Rid;
	}
	public void setRid(int rid) {
		Rid = rid;
	}
	public newReg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	

}
