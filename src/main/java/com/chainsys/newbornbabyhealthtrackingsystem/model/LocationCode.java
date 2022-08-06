package com.chainsys.newbornbabyhealthtrackingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author shan3102
 *
 */
@Entity
@Table(name ="LOCATION_CODE")
public class LocationCode {
	@Id
	@Column(name="PIN_CODE")
	private int pinCode;
	@Column(name="DISTRICT")
	private String district;
	@Column(name="STATE_NAME")
	private String stateName;
	@Column(name="COUNTRY")
	private String country;
	
//	@OneToMany(mappedBy = "loc")
	
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString() {
		return String.format("%s,%s,%s,%d",district,stateName,country,pinCode);
	}
	
}
