/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.dto.VaccinationStatusDTO;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Child;
import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationStatus;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.ChildRepository;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.VaccinationStatusRepository;

/**
 * @author shan3102
 *
 */
@Service
public class ChildServices {
	@Autowired
	private ChildRepository childRepo;

	public List<Child> getChilds() {
		return childRepo.findAll();
	}

	public Child findById(int childId) {
		return childRepo.findById(childId);
	}

	public Child addChild(Child theChild) {
		return childRepo.save(theChild);
	}

	public void removeChild(int childId) {
		childRepo.deleteById(childId);
	}

	@Transactional
	public VaccinationStatusDTO getChildVaccinestatus(int childId) {
		Child child = findById(childId);
		VaccinationStatusDTO vaccinationStatusDTO = new VaccinationStatusDTO();
		vaccinationStatusDTO.setChild(child);
		List<VaccinationStatus> vaccinationStatus = VaccinationStatusRepository.findChilById(childId);
		Iterator<VaccinationStatus> itr = vaccinationStatus.iterator();
		while (itr.hasNext()) {
			vaccinationStatusDTO.addVaccinationStatus((VaccinationStatus) itr.next());

		}
		return vaccinationStatusDTO;

	}

	public Child getChildById(int childId) {
		// TODO Auto-generated method stub
		return null;
	}


}
