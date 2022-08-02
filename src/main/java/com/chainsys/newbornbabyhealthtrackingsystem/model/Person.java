/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author shan3102
 *
 */
@Entity
@Table(name = "PERSON")
public class Person {
	@Id
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "USER_DOB")
	private Date userDob;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "PHONE_NUMBER")
	private long phoneNumber;
	@Column(name = "PASS_WORD")
	private String passWord;
	@Column(name = "DOOR_NO")
	private String doorNumber;
	@Column(name = "STREET")
	private String street;
	@Column(name = "PIN_CODE")
	private int pinCode;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

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

	public Date getUserDob() {
		return userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String toString() {
		return String.format("%d,%s,%s,%s,%s,%s,%s,%s,%s,%d", userId, userName, userDob, gender, email, passWord,
				phoneNumber, doorNumber, street, pinCode);
	}
}
