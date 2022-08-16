package com.chainsys.newbornbabyhealthtrackingsystem.compsitemodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class LoginUserCompositeClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "USER_ID")
	private Integer userId;
	@Id
	@Column(name = "USER_EMAIL")
	private String email;

	public LoginUserCompositeClass() {

	}

	public LoginUserCompositeClass(int userId, String email) {
		this.userId = userId;
		this.email=email;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
