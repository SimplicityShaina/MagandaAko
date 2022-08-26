package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityExampleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringSecurityExampleApplication.class, args);
		
		SpringApplication app = new SpringApplication(SpringSecurityExampleApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port","8086"));
		app.run(args);
		

	
	}

}
