/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationSchedular;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.VaccinationSchedularRepository;

/**
 * @author shan3102
 *
 */
@Service
public class VaccinationSchedularServices {
	@Autowired
	private VaccinationSchedularRepository vaccinationSchedularRepo;
	
	public List<VaccinationSchedular> getVaccinationSchedulars() {
		return vaccinationSchedularRepo.findAll();
	}

	public VaccinationSchedular getVaccinationSchedularsById(int id) {
		return vaccinationSchedularRepo.findById(id);
	}

	public VaccinationSchedular addVaccinationSchedular(VaccinationSchedular theVacschedule) {
		return vaccinationSchedularRepo.save(theVacschedule);
	}

	public void removeVaccinationSchedular(int id) {
		vaccinationSchedularRepo.deleteById(id);
	}

}
