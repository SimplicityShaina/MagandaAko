package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="demo",url="http://localhost:8084/user/")
public interface FeignServiceUtil {
	
	@GetMapping("/name")
	String getName();
	
	@GetMapping("/address")
	String getAddress();
	
	@GetMapping("/status")
	String getStatus();
}
