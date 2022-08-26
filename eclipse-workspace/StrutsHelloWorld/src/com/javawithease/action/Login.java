package com.javawithease.action;

/**
 * This class is used as an action class.
 * @author javawithease
 */
public class Login {
	//data members
	private String userName;
	
	//business logic
	public String execute(){
		return "success";	
	}	
	
	//getter setters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
