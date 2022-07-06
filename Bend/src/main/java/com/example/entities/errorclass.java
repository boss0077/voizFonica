package com.example.entities;

public class errorclass {
	private int errcode;
	private String errmsg;
	public int getErrcode() {
		return errcode;
	}
	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public errorclass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public errorclass(int errcode, String errmsg) {
		super();
		this.errcode = errcode;
		this.errmsg = errmsg;
	}
	


}
