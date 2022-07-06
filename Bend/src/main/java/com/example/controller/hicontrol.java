package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.errorclass;
import com.example.entities.login;
import com.example.service.loginserv;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins="http://localhost:56808")
public class hicontrol {
	public hicontrol() {
		System.out.println("<<<<<controler instansiated>>>>>");
	}
	@Autowired
	private loginserv ls;
	@PostMapping("/in")
	public ResponseEntity<?> lgn (@RequestBody login l){
		try {
			l=ls.sln(l);
			return new ResponseEntity<login>(l,HttpStatus.CREATED);
		}catch(Exception e) {
			errorclass ec=new errorclass(500,e.getMessage());
			return new ResponseEntity<errorclass>(ec, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}

}
