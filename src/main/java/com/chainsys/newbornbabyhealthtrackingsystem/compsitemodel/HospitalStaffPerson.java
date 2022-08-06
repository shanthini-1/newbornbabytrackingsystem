package com.chainsys.newbornbabyhealthtrackingsystem.compsitemodel;

import java.io.Serializable;

import javax.persistence.Column;

public class HospitalStaffPerson implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "HOSPITAL_ID")
	private int hospitalId;
	@Column(name = "STAFF_ID")
	private int staffId;

	public HospitalStaffPerson() {

	}

	public HospitalStaffPerson(int staffId, int hospitalId) {
		this.hospitalId = hospitalId;
		this.staffId = staffId;
	}

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

}
