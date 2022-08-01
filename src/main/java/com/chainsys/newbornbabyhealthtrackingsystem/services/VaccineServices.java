/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.pojo.Vaccine;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.VaccineRepository;

/**
 * @author shan3102
 *
 */
@Service
public class VaccineServices {
	@Autowired
	private VaccineRepository vacrepo ;
	
	
	public Vaccine addVaccine(Vaccine vac) {
		return vacrepo.save(vac);
	}


	public List<Vaccine> getvaccines() {
		List<Vaccine> vacclist = vacrepo.findAll();
		return vacclist;
	}
}
