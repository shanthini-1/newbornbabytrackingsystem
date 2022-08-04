/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;

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

	public HospitalStaff getHospitalStaffById(int hospitalId) {
		return hospitalStaffRepo.findById(hospitalId);
	}

	public HospitalStaff addHospitalStaff(HospitalStaff theHospitalStaff) {
		return hospitalStaffRepo.save(theHospitalStaff);
	}

	public void removeHospitalStaff(int hospitalId) {
		hospitalStaffRepo.deleteById(hospitalId);
	}

}
