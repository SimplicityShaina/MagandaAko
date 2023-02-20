package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }

    @PostMapping({"/CreateAccount"})
    @PreAuthorize("hasRole('Admin')")
    public User registerNewUser(@Valid @RequestBody User user) {
        return userService.registerNewUser(user);
    }

    @PostMapping({"/Login"})
    @PreAuthorize("hasAnyRole('Admin', 'User')")
    public ResponseEntity<?> forAdmin(@RequestBody User user) throws Exception{
    	return userService.Login(user);
    	
    		
    	
    	//return "This URL is only accessible to the admin";
    }

    @GetMapping({"/forUser"})
    @PreAuthorize("hasRole('User')")
    public String forUser(){
        return "This URL is only accessible to the user";
    }
}
