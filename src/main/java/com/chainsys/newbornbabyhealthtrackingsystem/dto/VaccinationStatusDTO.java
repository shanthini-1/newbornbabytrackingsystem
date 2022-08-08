package com.chainsys.newbornbabyhealthtrackingsystem.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Child;
import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationStatus;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Vaccine;

public class VaccinationStatusDTO {
	private Child childDto;
	private List<VaccinationStatus> vaccinationStatus = new ArrayList<VaccinationStatus>();
	private Vaccine vaccineDto;

	private List<Child> listOfChild = new ArrayList<Child>();
	public Child getChild() {
		return childDto;
	}

	public void setChild(Child child) {
		this.childDto = child;
	}

	public List<VaccinationStatus> getVaccinationStatus() {
		return vaccinationStatus;
	}

	public void addVaccinationStatus(VaccinationStatus vacStatus) {
		vaccinationStatus.add(vacStatus);
	}

	public Vaccine getVaccine(Vaccine vaccine) {
		return vaccineDto;
	}

	public void setVaccine(Vaccine vaccine) {
		this.vaccineDto = vaccine;
	}

	public List<Child> getListOfChild() {
		return listOfChild;
	}

	public void setListOfChild(List<Child> listOfChild) {
		this.listOfChild = listOfChild;
	}

}
