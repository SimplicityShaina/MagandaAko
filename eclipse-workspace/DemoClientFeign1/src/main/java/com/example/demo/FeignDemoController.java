package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.FeignServiceUtil;

@RestController
@RequestMapping("/demo")
public class FeignDemoController {
	
	@Autowired
	private FeignServiceUtil feignServiceUtil;
	
	@GetMapping("/user-name")
	public String getUserName() {
		return feignServiceUtil.getName();
	}
	
	@GetMapping("/user-address")
	public String getUserAddress() {
		return feignServiceUtil.getAddress();
	}
	
	@GetMapping("/user-status")
	public String getUserStatus() {
		return feignServiceUtil.getStatus();
	}
}