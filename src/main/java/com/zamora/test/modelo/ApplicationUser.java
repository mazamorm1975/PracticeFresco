package com.zamora.test.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApplicationUser {

	@Id
	private String user_mail;
	private String user_name;
	private String password;
	private String user_mobile;
	private String user_location;
	
	//constructor default
	public ApplicationUser() {
		
		super();
	}
	
	
	
	public ApplicationUser(String user_mail, String user_name, String password, String user_mobile,
			String user_location) {
		super();
		this.user_mail = user_mail;
		this.user_name = user_name;
		this.password = password;
		this.user_mobile = user_mobile;
		this.user_location = user_location;
		
	}




	//Getters and Setters
	public String getUser_mail() {
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_mobile() {
		return user_mobile;
	}
	public void setUser_mobile(String user_mobile) {
		this.user_mobile = user_mobile;
	}
	public String getUser_location() {
		return user_location;
	}
	public void setUser_location(String user_location) {
		this.user_location = user_location;
	}

	
	
	
	
}
