/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Vaccine;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.VaccineRepository;

/**
 * @author shan3102
 *
 */
@Service
public class VaccineServices {
	@Autowired
	private VaccineRepository vacRepo ;
	
	
	public Vaccine addVaccine(Vaccine vac) {
		return vacRepo.save(vac);
	}

	public void removeVaccine(int vacId) {
		vacRepo.deleteById(vacId);
	}
	
	public List<Vaccine> getVaccines() {
		List<Vaccine> vaccList = vacRepo.findAll();
		return vaccList;
	}

	public void removeVaccineById(int id) {
			vacRepo.deleteById(id);
	}

	public Vaccine getVaccinesById(int id) {
		return 	vacRepo.findByVaccineId(id);
	}
	

}
