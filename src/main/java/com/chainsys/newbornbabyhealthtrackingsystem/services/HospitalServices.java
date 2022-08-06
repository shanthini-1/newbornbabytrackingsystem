/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.dto.ContactPersonDTO;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Hospital;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.HospitalRepository;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.PersonRepository;

/**
 * @author shan3102
 *
 */
@Service
public class HospitalServices {
	@Autowired
	private HospitalRepository hospitalRepo;

	public List<Hospital> getHospitals() {
		return hospitalRepo.findAll();
	}

	public Hospital getHospitalById(int hospitalId) {
		return hospitalRepo.findByHospitalId(hospitalId);
	}

	public Hospital addHospital(Hospital theHospital) {
		return hospitalRepo.save(theHospital);
	}

	public void removeHospital(int hospitalId) {
		hospitalRepo.deleteById(hospitalId);
	}
	public Hospital getHosContactPersonById(int contactPersonId) {
		return hospitalRepo.findByContactPersonId(contactPersonId);
	}
	
//	@Transactional
//	public ContactPersonDTO getHospitalPerson(int id) {
//		Person theContactPerson = getContactPersonById(id);
//		ContactPersonDTO hosContactDto = new ContactPersonDTO();
//		hosContactDto.setContactPerson(theContactPerson);
//		return hosContactDto;	
//	}
//
//	private Person getContactPersonById(int contactPerson) {
//		return personRepo.findByUserId(contactPerson);
//	}

}
