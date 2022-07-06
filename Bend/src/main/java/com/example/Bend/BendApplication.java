package com.example.Bend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages ={"com.example.controller","com.example.service"})
@EntityScan(basePackages="com.example.entities")
@EnableJpaRepositories(basePackages = "com.example.dao")
@EnableWebMvc
public class BendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BendApplication.class, args);
	}

}
