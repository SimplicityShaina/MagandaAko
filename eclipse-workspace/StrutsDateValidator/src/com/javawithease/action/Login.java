package com.javawithease.action;

import org.apache.struts2.components.Date;

import com.opensymphony.xwork2.ActionSupport;

/**
 * This class is used as an action class.
 * @author javawithease
 */
public class Login extends ActionSupport{
	//data members
	private String userName;
	private Date dateOfBirth;
	
	//business logic
	public String execute(){
		return SUCCESS;	
	}	
	
	//getter setters
	public String getUserName() {
		
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
