package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;


public interface UserRepo extends JpaRepository<User, Long> {

	User findByUserName(String userName);

	User findByUserPassword(String userPassword);

	//User findByConfirmPassword(String confirmPassword);{

}
