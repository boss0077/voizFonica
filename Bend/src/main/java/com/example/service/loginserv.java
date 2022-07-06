package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.logindao;
import com.example.entities.login;



public class loginserv {
	public loginserv() {
		System.out.println("<<<<<<login service>>>>>>");
	}
	@Autowired
	logindao ld;
	public login sln(login l) {
		ld.save(l);
		return l;
	}
	
	/*
	 * public Optional<login> getpwdbyUN(String un){ return ld.findBy(un); }
	 */
	public login upload(login l) {
		return ld.save(l);
	}

}
