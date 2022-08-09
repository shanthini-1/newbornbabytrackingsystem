/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.chainsys.newbornbabyhealthtrackingsystem.dto.VaccinationStatusDTO;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Child;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.ChildRepository;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.HospitalRepository;
//import com.chainsys.newbornbabyhealthtrackingsystem.repository.VaccinationStatusRepository;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.VaccineRepository;

/**
 * @author shan3102
 *
 */
@Service
public class ChildServices {
	@Autowired
	private ChildRepository childRepo;
	@Autowired
	private HospitalRepository hosRepo;
	@Autowired
	private VaccineRepository vaccineRepository;

//	@Autowired
//	private VaccinationStatusServices vaccinationStatusServices;
//	@Autowired
//	private VaccinationStatusRepository vaccinationStatusRepository;

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
//
//	@Transactional
//	public VaccinationStatusDTO getChildVaccinestatus(int childId) {
//		Child child = findById(childId);
//		VaccinationStatusDTO vaccinationStatusDTO = new VaccinationStatusDTO();
//		vaccinationStatusDTO.setChild(child);
//		List<VaccinationStatus> vaccinationStatus = vaccinationStatusRepository.findByChildId(childId);
////		List<Vaccine> vac = vaccineRepository.findByVaccineId(vaccinationStatus.get(childId));
//		Iterator<VaccinationStatus> itr = vaccinationStatus.iterator();
//		while (itr.hasNext()) {
//			vaccinationStatusDTO.addVaccinationStatus((VaccinationStatus) itr.next());
//		}
//		return vaccinationStatusDTO;
//
//	}
//
//	public List<Child> findByChildId(VaccinationStatus vaccinationStatus) {
//		return childRepo.findById(vaccinationStatus);
//	}

	public List<Child> getChildByHospitalId(int hospitalId) {
		return childRepo.findAllByHospitalId(hospitalId);
	}

	public List<Child> getChildDoctorId(Integer doctorId) {
		return childRepo.findAllByDoctorId(doctorId);
		}

	public List<Child> getChildFatherMotherId(Integer fatherId,Integer motherId) {
		return childRepo.findAllByFatherIdAndMotherId(fatherId,motherId);
	}
//	public List<Child> getChildMotherId(Integer parentId) {
//		return childRepo.findAllByMotherId(parentId);
//	}
	public List<Child> getChildGuardianId(Integer parentId) {
		return childRepo.findAllByGuardianId(parentId);
	}


}
