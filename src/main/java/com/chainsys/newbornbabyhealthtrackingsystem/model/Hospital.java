/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private String hospitalPlotNo;
	@Column(name="HOSPITAL_STREET")
	private String hospitalStreet;
	@Column(name="HOSPITAL_CITY")
	private String hospitalCity;
	@Column(name="PIN_CODE")
	private int pinCode;
	@Column(name="CONTACT_PERSON_ID")
	private int contactPersonId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CONTACT_PERSON_ID",nullable = false,insertable = false,updatable = false )
	private Person contactPerson;
	
	@OneToMany(mappedBy = "hospital",fetch = FetchType.LAZY)
	private List<Child> hospitalChilds;
	
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
		return hospitalPlotNo;
	}
	public void setHospitalPlotNo(String hospitalPlotNo) {
		this.hospitalPlotNo = hospitalPlotNo;
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
	public int getContactPersonId() {
		return contactPersonId;
	}
	public void setContactPersonId(int contactPersonId) {
		this.contactPersonId = contactPersonId;
	}
	
	public String toString() {
		return String.format("%d,%s,%s,%s,%s,%d,%d,",hospitalId,hospitalName,hospitalPlotNo,hospitalStreet,hospitalCity,pinCode,contactPersonId);
	}
}
