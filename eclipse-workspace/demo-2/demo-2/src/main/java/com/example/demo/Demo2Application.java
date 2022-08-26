package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Demo2Application {

	@RequestMapping("/shaina")
	public String index()
	{
		return "Greetings from Spring Boot!";
		  //docker build -t projectdocker .
		  //docker container run --name hello -p 8080:8080 -d projectdocker
		  //docker container logs hello
	}

}
