package com.project.onlinebanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OnlinebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinebankingApplication.class, args);
		System.out.println("spring started");
//
//		RestTemplate restTemplate = new RestTemplate();
//		String response = restTemplate.getForObject("http://localhost:8085/transaction", String.class);
//		System.out.println(response);
//		
	}
}
