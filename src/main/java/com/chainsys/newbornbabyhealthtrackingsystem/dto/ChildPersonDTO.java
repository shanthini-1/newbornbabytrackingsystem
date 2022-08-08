package com.chainsys.newbornbabyhealthtrackingsystem.dto;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Child;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;

public class ChildPersonDTO {
	private Child child;
	private Person person;

//	private Hospital hospital;private HospitalStaff hospitalStaff;
//  include getter setter

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
