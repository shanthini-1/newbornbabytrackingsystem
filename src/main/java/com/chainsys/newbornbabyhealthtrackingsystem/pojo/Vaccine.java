/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author shan3102
 *
 */
@Entity
@Table(name="VACCINE")
public class Vaccine {
	@Id
	@Column(name="VACCINE_ID")
	private int vaccine_id;
	@Column(name="WEEK")
	private int week;
	@Column(name="VACCINE_NAME")
	private String vaccine_name;
	@Column(name="VAC_DESCRIPTION")
	private String vac_description;
	@Column(name="DOSAGE")
	private int dosage;
	@Column(name="SUGGESTION")
	private String suggestion;
	@Column(name="VACCINE_PRICE")
	private float vaccine_price;
	
	public int getVaccine_id() {
		return vaccine_id;
	}
	public void setVaccine_id(int vaccine_id) {
		this.vaccine_id = vaccine_id;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public String getVaccine_name() {
		return vaccine_name;
	}
	public void setVaccine_name(String vaccine_name) {
		this.vaccine_name = vaccine_name;
	}
	public String getVac_description() {
		return vac_description;
	}
	public void setVac_description(String vac_description) {
		this.vac_description = vac_description;
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
	public float getVaccine_price() {
		return vaccine_price;
	}
	public void setVaccine_price(float vaccine_price) {
		this.vaccine_price = vaccine_price;
	}

	@Override
	public String toString() {
		return String.format("%d, %d, %s, %s, %d, %s, %2f,vaccine_id,week,vaccine_name, vac_description,dosage,suggestion,vaccine_price");
	}
}
