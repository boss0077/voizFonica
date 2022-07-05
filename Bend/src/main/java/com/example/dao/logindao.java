package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.login;

@Repository
public interface logindao extends JpaRepository<login, Integer> {

}
