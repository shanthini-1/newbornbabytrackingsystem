/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationSchedular;

/**
 * @author shan3102
 *
 */
public interface VaccinationSchedularRepository extends CrudRepository<VaccinationSchedular, Integer> {
	VaccinationSchedular findById(int childId);

	VaccinationSchedular save(VaccinationSchedular vaccineSchedule);

	void deleteById(int childId);

	List<VaccinationSchedular> findAll();
}
