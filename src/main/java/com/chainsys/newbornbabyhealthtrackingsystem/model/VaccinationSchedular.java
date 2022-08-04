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
/*
 * composite key
 */
@Entity
@Table(name="VACCINATION_SCHEDULER")
public class VaccinationSchedular {
	@Id
	@Column(name="CHILD_ID")
	private int childId;
	@Column(name="VACCINE_ID")
	private int vaccineId;
	@Column(name="DATE_TO_VACCINATE")
	private Date dateToVaccinate;
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
	public Date getDateToVaccinate() {
		return dateToVaccinate;
	}
	public void setDateToVaccinate(Date dateToVaccinate) {
		this.dateToVaccinate = dateToVaccinate;
	}
	public String toString() {
		return String.format("%d,%d,%s", childId,vaccineId,dateToVaccinate);
	}
}
