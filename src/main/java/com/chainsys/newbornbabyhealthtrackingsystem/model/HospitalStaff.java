package com.chainsys.newbornbabyhealthtrackingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author shan3102
 *
 */
/*
 * composite key 
 */
@Entity
@Table(name="HOSPITAL_STAFF")
public class HospitalStaff {
	@Id
	@Column(name="STAFF_ID")
	private int hospitalId;
	@Column(name="HOSPITAL_ID")
	private int staffId;
	@Column(name="STAFF_ROLE")
	private String staffRole;
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffRole() {
		return staffRole;
	}
	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole;
	}
	public String toString() {
		return String.format("%d,%d,%s", hospitalId,staffId,staffRole);
	}
	
}
