package com.chainsys.newbornbabyhealthtrackingsystem.dto;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Hospital;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;
/*
 * used to get Hospital.contactPerson from User.userId
 */
public class ContactPersonDTO {
	private Person contactPerson;
	private Hospital hospitalPerson;

	public Hospital getHospitalPerson() {
		return hospitalPerson;
	}

	public void setHospitalPerson(Hospital hospitalPerson) {
		this.hospitalPerson = hospitalPerson;
	}

	public Person getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(Person contactPerson) {
		this.contactPerson = contactPerson;
	}

//	if list means .add() used in line 24	
	
}
