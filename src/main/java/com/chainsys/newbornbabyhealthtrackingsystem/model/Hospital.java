/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author shan3102
 *
 */
@Entity
@Table(name="HOSPITAL")
public class Hospital {
	@Id
	@Column(name="HOSPITAL_ID")
	private int hospitalId;
	@Column(name="HOSPITAL_NAME")
	private String hospitalName;
	@Column(name="HOSPITAL_PLOT_NO")
	private String HospitalPlotNo;
	@Column(name="HOSPITAL_STREET")
	private String hospitalStreet;
	@Column(name="HOSPITAL_CITY")
	private String hospitalCity;
	@Column(name="HOSPITAL_PIN_CODE")
	private int pinCode;
	@Column(name="CONTACT_PERSON_ID")
	private String contactPersonId;
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalPlotNo() {
		return HospitalPlotNo;
	}
	public void setHospitalPlotNo(String hospitalPlotNo) {
		HospitalPlotNo = hospitalPlotNo;
	}
	public String getHospitalStreet() {
		return hospitalStreet;
	}
	public void setHospitalStreet(String hospitalStreet) {
		this.hospitalStreet = hospitalStreet;
	}
	public String getHospitalCity() {
		return hospitalCity;
	}
	public void setHospitalCity(String hospitalCity) {
		this.hospitalCity = hospitalCity;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getContactPersonId() {
		return contactPersonId;
	}
	public void setContactPersonId(String contactPersonId) {
		this.contactPersonId = contactPersonId;
	}
	
	public String toString() {
		return String.format("%d,%s,%s,%s,%s,%d,%d,",hospitalId,hospitalName,HospitalPlotNo,hospitalStreet,hospitalCity,pinCode,contactPersonId);
	}
}
