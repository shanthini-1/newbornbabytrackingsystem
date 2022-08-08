package com.chainsys.newbornbabyhealthtrackingsystem.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.chainsys.newbornbabyhealthtrackingsystem.compsitemodel.HospitalStaffPerson;

/**
 * @author shan3102
 *
 */
/*
 * composite key
 */
@Entity
@Table(name = "HOSPITAL_STAFF")
public class HospitalStaff {

	@Column(name = "HOSPITAL_ID")
	private int hospitalId;
	@Id
	@Column(name = "STAFF_ID")
	private long staffId;
	@Column(name = "STAFF_ROLE")
	private String staffRole;

	/*
	 * unidirectional fetch staff from person table
	 */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STAFF_ID", nullable = false, insertable = false, updatable = false)
	private Person hosStaff;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HOSPITAL_ID", nullable = false, insertable = false, updatable = false)
	private Hospital hospital;

	@OneToMany(mappedBy = "doctor")
	private List<Child> doctorChilds;
	
	public Person getHosStaff() {
		return hosStaff;
	}

	public void setHosStaff(Person hosStaff) {
		this.hosStaff = hosStaff;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public long getStaffId() {
		return staffId;
	}

	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}

	public String getStaffRole() {
		return staffRole;
	}

	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole;
	}

	public String toString() {
		return String.format("%d,%d,%s", hospitalId, staffId, staffRole);
	}

}
