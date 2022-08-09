/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Hospital;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.HospitalRepository;

/**
 * @author shan3102
 *
 */
@Service
public class HospitalServices {
	@Autowired
	private HospitalRepository hospitalRepo;
	@Autowired
	private PersonServices personServices;

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
	public Hospital getHosContactPersonById(Integer contactPersonId) {
		return hospitalRepo.findByContactPersonId(contactPersonId);
	}
	
	public List<Hospital> getHospitalsByContactperson(Integer conperson) {
		return hospitalRepo.findAllByContactPersonId(conperson);
	}
	
	

}
