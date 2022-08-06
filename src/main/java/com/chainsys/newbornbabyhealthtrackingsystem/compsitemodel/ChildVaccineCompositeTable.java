package com.chainsys.newbornbabyhealthtrackingsystem.compsitemodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationStatus;

public class ChildVaccineCompositeTable implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "CHILD_ID")
	private int childId;
	@Column(name = "VACCINE_ID")
	private int vaccineId;
	

	
	public ChildVaccineCompositeTable() {

	}

	public ChildVaccineCompositeTable(int childId, int vaccineId) {
		this.childId = childId;
		this.vaccineId = vaccineId;
	}

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

}
