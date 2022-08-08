package com.chainsys.newbornbabyhealthtrackingsystem.dto;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Child;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Vaccine;

public class ChildVaccineDTO {
	private Child child;
	private Vaccine vaccine;

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	public Vaccine getVaccine() {
		return vaccine;
	}

	public void setVaccine(Vaccine vaccine) {
		this.vaccine = vaccine;
	}

}
