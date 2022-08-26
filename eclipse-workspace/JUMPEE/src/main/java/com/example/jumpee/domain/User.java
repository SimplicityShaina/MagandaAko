package com.example.jumpee.domain;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userid;
    @NotEmpty(message = "First name is required")
    @Size(min = 3, message = "First name must be at least 3 characters")
    private String firstname;
    @NotEmpty(message = "Last name is required")
    @Size(min = 2, message = "Last name must be at least 2 characters")
    private String lastname;
    @Email
    @NotEmpty(message = "Email address is required")
    private String email;
    @NotEmpty(message = "Password is required")
    @NotNull
    private String password;
    @Transient
    private String confirmpassword;
    private String phonenumber;
    private String landlinenumber;
    @Column(name = "verification_code", length = 64)
    private String verificationCode;
    private boolean enabled;

	public Long getUserid() {
		return userid;
	}
	public String getVerificationCode() {
		return verificationCode;
	}
	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getLandlinenumber() {
		return landlinenumber;
	}
	public void setLandlinenumber(String landlinenumber) {
		this.landlinenumber = landlinenumber;
	}
	public String getFullName() {
		// TODO Auto-generated method stub
		return this.firstname + " " + this.lastname;
	}
	
    
    
}
