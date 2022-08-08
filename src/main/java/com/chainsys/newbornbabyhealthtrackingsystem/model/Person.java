
/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	private long userId;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "USER_DOB")
	private Date userDob;
	@Column(name = "GENDER")
	private String gender;
	@Column(name="PERSON_CATEGORY")
	private String personCategory;
	@Column(name = "PHONE_NO")
	private long phoneNumber;
	@Column(name = "PASS_WORD")
	private String passWord;
	@Column(name = "DOOR_NO")
	private String doorNumber;
	@Column(name = "STREET")
	private String street;
	@Column(name = "CITY")
	private String city;
	@Column(name = "PIN_CODE")
	private int pinCode;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="PIN_CODE",nullable = false,insertable = false,updatable = false)
	private LocationCode loc ;
	/*
	 * unidirectional fetch location from location table 
	 */
	
	public LocationCode getLoc() {
		return loc;
	}

	public void setLoc(LocationCode loc) {
		this.loc = loc;
	}
	
	@OneToMany(mappedBy = "father")
	private List<Child> fatherChilds;
	@OneToMany(mappedBy = "mother")
	private List<Child> motherChilds;
	@OneToMany(mappedBy = "guardian")
	private List<Child> guardianChilds;
	
	
	public List<Child> getFatherChilds() {
		return fatherChilds;
	}

	public void setFatherChilds(List<Child> fatherChilds) {
		this.fatherChilds = fatherChilds;
	}

	public List<Child> getMotherChilds() {
		return motherChilds;
	}

	public void setMotherChilds(List<Child> motherChilds) {
		this.motherChilds = motherChilds;
	}

	public List<Child> getGuardianChilds() {
		return guardianChilds;
	}

	public void setGuardianChilds(List<Child> guardianChilds) {
		this.guardianChilds = guardianChilds;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
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

	public String getPersonCategory() {
		return personCategory;
	}

	public void setPersonCategory(String personCategory) {
		this.personCategory = personCategory;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String toString() {
		return String.format("%L,%s,%s,%s,%s,%s,%s,%s,%s,%s", userId, userName, userDob, gender, email, passWord,
				phoneNumber, doorNumber, street,city );
	}
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj == null) {
			return false;
		}
		Class<? extends Object> c1 = obj.getClass();
		if (c1 == this.getClass()) {
			Person other = (Person) obj;
			if (other.hashCode() == this.hashCode()) {
				result = true;
			}
		}
		return result;
	}

	public int hashCode() {
		return (int) this.userId;
	}
	
}
