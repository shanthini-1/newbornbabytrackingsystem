/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private long doctorId;
	@Column(name = "FATHER_ID")
	private long fatherId;
	@Column(name = "MOTHER_ID")
	private long motherId;
	@Column(name = "GUARDIAN_ID")
	private long guardianId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HOSPITAL_ID", nullable = false, insertable = false, updatable = false)
	private Hospital hospital;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DOCTOR_ID", nullable = false, insertable = false, updatable = false)
	private HospitalStaff doctor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FATHER_ID", nullable = false, insertable = false, updatable = false)
	private Person father;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MOTHER_ID", nullable = false, insertable = false, updatable = false)
	private Person mother;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GUARDIAN_ID", nullable = false, insertable = false, updatable = false)
	private Person guardian;

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public Person getMother() {
		return mother;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}

	public Person getGuardian() {
		return guardian;
	}

	public void setGuardian(Person guardian) {
		this.guardian = guardian;
	}

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

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public long getFatherId() {
		return fatherId;
	}

	public void setFatherId(long fatherId) {
		this.fatherId = fatherId;
	}

	public long getMotherId() {
		return motherId;
	}

	public void setMotherId(long motherId) {
		this.motherId = motherId;
	}

	public long getGuardianId() {
		return guardianId;
	}

	public void setGuardianId(long guardianId) {

		this.guardianId = guardianId;
	}

	public HospitalStaff getDoctor() {
		return doctor;
	}

	public void setDoctor(HospitalStaff doctor) {
		this.doctor = doctor;
	}

	public String toString() {
		return String.format("%d,%s,%s,%s,%d,%s,%s,%d,%L,%L,%L,%L", childId, childName, childDob, gender, birthWeight,
				birthPlace, bloodGroup, hospitalId, doctorId, fatherId, motherId, guardianId);
	}
}
