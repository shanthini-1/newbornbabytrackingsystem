/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.chainsys.newbornbabyhealthtrackingsystem.compsitemodel.ChildVaccineCompositeTable;

/**
 * @author shan3102
 *
 */
/*
 * composite key
 */
@Entity
@Table(name = "VACCINATION_STATUS")
@IdClass(ChildVaccineCompositeTable.class)
public class VaccinationStatus {
	@Id
	@Column(name = "CHILD_ID")
	private int childId;
	@Id
	@Column(name = "VACCINE_ID")
	private int vaccineId;
	@Column(name = "DTAE_OF_VACCINATION")
	private Date dateOfVaccination;
	@Column(name = "VACCINATED_STATUS")
	private String vaccinatedStatus;
	@Column(name = "HOSPITAL_ID")
	private int hospitalId;
	@Column(name = "ATTENDER_ID")
	private long attenderId;
	@Column(name = "BABY_WEIGHT")
	private double babyWeight;
	@Column(name = "BABY_HEIGHT")
	private double babyHeight;

	
	public int getChildId() {
		return childId;
	}

	public void setChildId(int childId) {
		this.childId = childId;
	}

	public int getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(int vaccineId) {
		this.vaccineId = vaccineId;
	}

	public Date getDateOfVaccination() {
		return dateOfVaccination;
	}

	public void setDateOfVaccination(Date dateOfVaccination) {
		this.dateOfVaccination = dateOfVaccination;
	}

	public String getVaccinatedStatus() {
		return vaccinatedStatus;
	}

	public void setVaccinatedStatus(String vaccinatedStatus) {
		this.vaccinatedStatus = vaccinatedStatus;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public long getAttenderId() {
		return attenderId;
	}

	public void setAttenderId(long attenderId) {
		this.attenderId = attenderId;
	}

	public double getBabyWeight() {
		return babyWeight;
	}

	public void setBabyWeight(double babyWeight) {
		this.babyWeight = babyWeight;
	}

	public double getBabyHeight() {
		return babyHeight;
	}

	public void setBabyHeight(double babyHeight) {
		this.babyHeight = babyHeight;
	}

	public String toString() {
		return String.format("%L,%d,%s,%s,%L,%d,%2f,%2f", childId, vaccineId, dateOfVaccination, vaccinatedStatus,
				hospitalId, attenderId, babyWeight, babyHeight);
	}

}
