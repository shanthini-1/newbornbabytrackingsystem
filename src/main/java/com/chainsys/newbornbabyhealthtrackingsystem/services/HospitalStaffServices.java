/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.model.HospitalStaff;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.HospitalStaffRepository;

/**
 * @author shan3102
 *
 */
@Service
public class HospitalStaffServices {
	@Autowired
	private HospitalStaffRepository hospitalStaffRepo;	
	

	public List<HospitalStaff> getHospitalStaffs() {
		return hospitalStaffRepo.findAll();
	}

	public Optional<HospitalStaff> getHospitalStaffById(Integer staffId) {
		return hospitalStaffRepo.findById(staffId);
	}

	public HospitalStaff addHospitalStaff(HospitalStaff theHospitalStaff) {
		return hospitalStaffRepo.save(theHospitalStaff);
	}

	public void removeHospitalStaff(Integer staffId) {
		hospitalStaffRepo.deleteById(staffId);
	}
	
//	
//	@Transactional
//	public ContactPersonDTO getStaffFromPerson(Integer staffId) {
//		Person person =getStaffById(staffId);
//		ContactPersonDTO hosStaffDto= new ContactPersonDTO();
//		hosStaffDto.setContactPerson(person);
//		return hosStaffDto;
//	}

//	private Person getStaffById(Integer staffId) {
//		return personRepo.findByUserId(staffId);
//	}

}
