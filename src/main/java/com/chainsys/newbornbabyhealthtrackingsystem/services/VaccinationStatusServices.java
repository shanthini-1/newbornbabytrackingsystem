/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationStatus;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.VaccinationStatusRepository;

/**
 * @author shan3102
 *
 */
@Service
public class VaccinationStatusServices {
	@Autowired
	private VaccinationStatusRepository vaccinationStatusRepo;

	public List<VaccinationStatus> getVaccinationStatus() {
		return vaccinationStatusRepo.findAll();
	}

	public VaccinationStatus getVaccinationStatussById(int id) {
		return vaccinationStatusRepo.findById(id);
	}

	public VaccinationStatus addVaccinationStatus(VaccinationStatus theVac) {
		return vaccinationStatusRepo.save(theVac);
	}

	public void removeVaccinationStatus(int id) {
		vaccinationStatusRepo.deleteById(id);		
	}

}
