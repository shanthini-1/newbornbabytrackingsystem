package com.chainsys.newbornbabyhealthtrackingsystem.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "LOGIN")
//@IdClass(LoginUserCompositeClass.class)
public class Login {
	@Id
	@Column(name = "USER_EMAIL")
	private String email;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "PASS_WORD")
	private String passWord;
	@Column(name = "REGISTERATION_DATE")
	private Date registerationDate;
//	@Column(name="LAST_PASSWORD")
//	private String lastPassWord;
//	@Column(name = "LAST_DATE_OF_PASSWORD_CHANGED")
//	private String lastDateOfPasswordChanged;
//	public Integer getUserId() {
//		return userId;
//	}
//	public void setUserId(Integer userId) {
//		this.userId = userId;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Date getRegisterationDate() {
		return registerationDate;
	}
	public void setRegisterationDate() {
		Date date = Date.valueOf(LocalDate.now());
		this.registerationDate = date;
	}
//	public String getLastPassWord() {
//		return lastPassWord;
//	}
//	public void setLastPassWord(String lastPassWord) {
//		this.lastPassWord = lastPassWord;
//	}
//	public String getLastDateOfPasswordChanged() {
//		return lastDateOfPasswordChanged;
//	}
//	public void setLastDateOfPasswordChanged(String lastDateOfPasswordChanged) {
//		this.lastDateOfPasswordChanged = lastDateOfPasswordChanged;
//	}

}
