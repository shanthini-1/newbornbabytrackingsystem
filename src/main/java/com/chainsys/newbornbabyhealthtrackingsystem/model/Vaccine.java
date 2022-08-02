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
@Table(name = "VACCINE")
public class Vaccine {
	@Id
	@Column(name = "VACCINE_ID")
	private int vaccineId;
	@Column(name = "WEEK")
	private int week;
	@Column(name = "VACCINE_NAME")
	private String vaccineName;
	@Column(name = "VAC_DESCRIPTION")
	private String vacDescription;
	@Column(name = "DOSAGE")
	private int dosage;
	@Column(name = "SUGGESTION")
	private String suggestion;
	@Column(name = "VACCINE_PRICE")
	private float vaccinePrice;

	public int getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(int vaccineId) {
		this.vaccineId = vaccineId;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getVacDescription() {
		return vacDescription;
	}

	public void setVacDescription(String vacDescription) {
		this.vacDescription = vacDescription;
	}

	public int getDosage() {
		return dosage;
	}

	public void setDosage(int dosage) {
		this.dosage = dosage;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public float getVaccinePrice() {
		return vaccinePrice;
	}

	public void setVaccinePrice(float vaccinePrice) {
		this.vaccinePrice = vaccinePrice;
	}

	@Override
	public String toString() {
		return String.format(
				"%d, %d, %s, %s, %d, %s, %2f,vaccine_id,week,vaccine_name, vac_description,dosage,suggestion,vaccine_price");
	}
}
