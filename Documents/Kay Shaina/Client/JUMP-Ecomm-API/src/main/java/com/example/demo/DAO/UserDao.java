package com.example.demo.DAO;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;



@Repository
public interface UserDao extends CrudRepository<User, String> {

	
	
}
