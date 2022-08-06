package com.chainsys.newbornbabyhealthtrackingsystem.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Child;
import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationStatus;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Vaccine;


public class VaccinationStatusDTO {
 private Child child;
 private List<VaccinationStatus> vaccinationStatus = new ArrayList<VaccinationStatus>();
 private Vaccine vaccine;
public Child getChild() {
	return child;
}
public void setChild(Child child) {
	this.child = child;
}
public List<VaccinationStatus> getVaccinationStatus() {
	return vaccinationStatus;
}
public void addVaccinationStatus(VaccinationStatus vacStatus) {
	vaccinationStatus.add(vacStatus);
}
public Vaccine getVaccine() {
	return vaccine;
}
public void setVaccine(Vaccine vaccine) {
	this.vaccine = vaccine;
}
 
}
