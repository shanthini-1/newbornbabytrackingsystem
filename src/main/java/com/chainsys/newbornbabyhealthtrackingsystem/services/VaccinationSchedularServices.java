/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationSchedular;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Vaccine;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.VaccinationSchedularRepository;



/**
 * @author shan3102
 *
 */
@Service
public class VaccinationSchedularServices {
	@Autowired
	private VaccinationSchedularRepository vaccinationSchedularRepo;
	@Autowired
	private ChildServices childServices;
	@Autowired
	private VaccineServices vaccineServices;
//	@Autowired
//	private VaccinationSchedular schedular;
	

	
	public List<VaccinationSchedular> getVaccinationSchedulars() {
		return vaccinationSchedularRepo.findAll();
	}

	public List<VaccinationSchedular> getVaccinationSchedularsById(int cid) {
		
		List<VaccinationSchedular> schedular = vaccinationSchedularRepo.findByChildId(cid);
		System.out.println("[debug ] : size : "+schedular.size());
		Iterator<VaccinationSchedular> itr = schedular.iterator();
		while (itr.hasNext()) {
			VaccinationSchedular  vs = itr.next();
			System.out.println("[Debug  ] : VaccinationSchedularServices.getVaccinationSchedularsById : "
					+vs.getVaccineId()+" "+vs.getVaccine().getVaccineName());
		}
		return schedular;
	}

//	public VaccinationSchedular addVaccinationSchedular(VaccinationSchedular theVacschedule) {
//		return vaccinationSchedularRepo.save(theVacschedule);
//	}
//
//	public void removeVaccinationSchedular(int id) {
//		vaccinationSchedularRepo.deleteById(id);
//	}

}
