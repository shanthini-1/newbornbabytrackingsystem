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
@Table(name = "CHILD_TABLE")
public class Child {
	@Id
	@Column(name = "CHILD_ID")
	private int childId;
	@Column(name = "CHILD_NAME")
	private String childName;
	@Column(name = "CHILD_DOB")
	private Date childDob;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "BIRTH_WEIGHT")
	private double birthWeight;
	@Column(name = "BIRTH_PLACE")
	private String birthPlace;
	@Column(name = "BLOOD_GROUP")
	private String bloodGroup;
	@Column(name = "HOSPITAL_ID")
	private int hospitalId;
	@Column(name = "DOCTOR_ID")
	private int doctorId;
	@Column(name = "FATHER_ID")
	private int fatherId;
	@Column(name = "MOTHER_ID")
	private int motherId;
	@Column(name = "GUARDIAN_ID")
	private int guardianId;

	public int getChildId() {
		return childId;
	}

	public void setChildId(int childId) {
		this.childId = childId;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public Date getChildDob() {
		return childDob;
	}

	public void setChildDob(Date childDob) {
		this.childDob = childDob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getBirthWeight() {
		return birthWeight;
	}

	public void setBirthWeight(double birthWeight) {
		this.birthWeight = birthWeight;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getFatherId() {
		return fatherId;
	}

	public void setFatherId(int fatherId) {
		this.fatherId = fatherId;
	}

	public int getMotherId() {
		return motherId;
	}

	public void setMotherId(int motherId) {
		this.motherId = motherId;
	}

	public int getGuardianId() {
		return guardianId;
	}

	public void setGuardianId(int guardianId) {
		this.guardianId = guardianId;
	}

	public String toString() {
		return String.format("%d,%s,%s,%s,%d,%s,%s,%d,%d,%d,%d,%d", childId, childName, childDob, gender, birthWeight,
				birthPlace, bloodGroup, hospitalId, doctorId, fatherId, motherId, guardianId);
	}
}
