/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.compsitemodel.ChildVaccineCompositeTable;
import com.chainsys.newbornbabyhealthtrackingsystem.dto.VaccinationStatusDTO;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Child;
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

	public Optional<VaccinationStatus> getVaccinationStatussById(ChildVaccineCompositeTable compId) {
		return vaccinationStatusRepo.findById(compId);
	}

	public VaccinationStatus addVaccinationStatus(VaccinationStatus theVac) {
		return vaccinationStatusRepo.save(theVac);
	}

	public void removeVaccinationStatus(ChildVaccineCompositeTable compId) {
		vaccinationStatusRepo.deleteById(compId);		
	}

	public List<VaccinationStatus> getChildrenListByVacId(int vaccineid) {
		return vaccinationStatusRepo.findByVaccineId(vaccineid);
	}


	
	
}
