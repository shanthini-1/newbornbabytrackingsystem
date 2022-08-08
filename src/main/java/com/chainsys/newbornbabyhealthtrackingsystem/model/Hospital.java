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

import com.chainsys.newbornbabyhealthtrackingsystem.compsitemodel.ChildVaccineCompositeTable;

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
	private long contactPersonId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CONTACT_PERSON_ID",nullable = false,insertable = false,updatable = false )
	private Person contactPerson;
	
	@OneToMany(mappedBy = "hospital",fetch = FetchType.LAZY)
	private List<Child> hospitalChilds;
	
	public Person getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(Person contactPerson) {
		this.contactPerson = contactPerson;
	}
	public List<Child> getHospitalChilds() {
		return hospitalChilds;
	}
	public void setHospitalChilds(List<Child> hospitalChilds) {
		this.hospitalChilds = hospitalChilds;
	}
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
	public long getContactPersonId() {
		return contactPersonId;
	}
	public void setContactPersonId(long contactPersonId) {
		this.contactPersonId = contactPersonId;
	}
	
	public String toString() {
		return String.format("%d,%s,%s,%s,%s,%d,%L",hospitalId,hospitalName,hospitalPlotNo,hospitalStreet,hospitalCity,pinCode,contactPersonId);
	}
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj == null) {
			return false;
		}
		Class<? extends Object> c1 = obj.getClass();
		if (c1 == this.getClass()) {
			Hospital other = (Hospital) obj;
			if (other.hashCode() == this.hashCode()) {
				result = true;
			}
		}
		return result;
	}

	public int hashCode() {
		return this.hospitalId;
	}
}

